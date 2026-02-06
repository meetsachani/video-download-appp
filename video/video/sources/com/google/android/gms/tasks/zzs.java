package com.google.android.gms.tasks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzs implements OnTokenCanceledListener {
    public final /* synthetic */ TaskCompletionSource a;

    public zzs(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public final void b() {
        zzw zzwVar;
        zzwVar = this.a.a;
        zzwVar.A();
    }
}
