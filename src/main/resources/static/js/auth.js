async function requireRole(role, options) {
    const wrongRoleUrl = (options && options.wrongRoleUrl) || '/login';
    try {
        const res = await fetch('/api/auth/me', { credentials: 'include' });
        if (!res.ok) { window.location.href = '/login'; return null; }
        const user = await res.json();
        if (user.role !== role) { window.location.href = wrongRoleUrl; return null; }
        return user;
    } catch (_) {
        window.location.href = '/login';
        return null;
    }
}

async function handleLogout() {
    try {
        await fetch('/api/auth/logout', { method: 'POST', credentials: 'include' });
    } catch (_) {}
    window.location.href = '/login';
}
