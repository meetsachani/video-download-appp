package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* loaded from: classes3.dex */
class GetAuthTokenListener implements StateListener {
    public final Utils a;
    public final TaskCompletionSource<InstallationTokenResult> b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource<InstallationTokenResult> taskCompletionSource) {
        this.a = utils;
        this.b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean a(Exception exc) {
        this.b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.k() && !this.a.f(persistedInstallationEntry)) {
            this.b.c(InstallationTokenResult.a().b(persistedInstallationEntry.b()).d(persistedInstallationEntry.c()).c(persistedInstallationEntry.h()).a());
            return true;
        }
        return false;
    }
}
