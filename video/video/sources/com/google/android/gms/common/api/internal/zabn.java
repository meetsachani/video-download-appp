package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabn implements Runnable {
    public final /* synthetic */ int X;
    public final /* synthetic */ zabq Y;

    public zabn(zabq zabqVar, int i) {
        this.Y = zabqVar;
        this.X = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.h(this.X);
    }
}
