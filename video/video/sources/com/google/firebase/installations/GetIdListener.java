package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class GetIdListener implements StateListener {
    public final TaskCompletionSource<String> a;

    public GetIdListener(TaskCompletionSource<String> taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.l() && !persistedInstallationEntry.k() && !persistedInstallationEntry.i()) {
            return false;
        }
        this.a.e(persistedInstallationEntry.d());
        return true;
    }
}
