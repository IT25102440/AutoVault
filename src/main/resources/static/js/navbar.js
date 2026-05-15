(function () {
    async function initNavbar() {
        const root = document.getElementById('navbar-root');
        if (!root) return;
        const mode = root.dataset.mode || 'auth';

        const nav = document.createElement('nav');
        nav.className = 'navbar d-flex justify-content-between align-items-center';

        if (mode === 'public') {
            nav.innerHTML = `
                <a href="/" class="navbar-brand">Auto<span>Lane</span></a>
                <div class="d-flex gap-2 align-items-center" id="navActions">
                    <a href="/login" class="nav-btn">Login</a>
                    <a href="/register" class="nav-btn filled">Sign Up</a>
                </div>`;
            root.replaceWith(nav);
            try {
                const res = await fetch('/api/auth/me', { credentials: 'include' });
                if (res.ok) {
                    const user = await res.json();
                    const actions = document.getElementById('navActions');
                    if (actions) {
                        actions.innerHTML = `
                            <a href="/${user.dashboard}" class="nav-user-chip">
                                <span class="nav-avatar">${user.name.charAt(0)}</span>
                                <span class="nav-username">${user.name}</span>
                            </a>
                            <button class="nav-btn nav-btn-logout" onclick="handleLogout()">Log Out</button>`;
                    }
                }
            } catch (_) {}
            return;
        }

        if (mode === 'seller-nav') {
            nav.innerHTML = `
                <a href="/" class="navbar-brand">Auto<span>Lane</span></a>
                <button class="nav-btn nav-btn-logout" onclick="handleLogout()">Log Out</button>`;
        } else if (mode === 'admin-nav') {
            nav.innerHTML = `
                <div>
                    <a href="/" class="navbar-brand">Auto<span>Lane</span></a>
                    <span class="admin-badge">Admin</span>
                </div>
                <button class="nav-btn nav-btn-logout" onclick="handleLogout()">Log Out</button>`;
        } else if (mode === 'back-dashboard') {
            nav.innerHTML = `
                <a href="/" class="navbar-brand">Auto<span>Lane</span></a>
                <a href="/seller-dashboard" class="nav-btn nav-btn-back">← Dashboard</a>`;
        } else {
            nav.innerHTML = `<a href="/" class="navbar-brand">Auto<span>Lane</span></a>`;
        }

        root.replaceWith(nav);
    }

    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', initNavbar);
    } else {
        initNavbar();
    }
})();
