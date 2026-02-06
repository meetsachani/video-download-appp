package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes2.dex */
public abstract class zzfnj extends AsyncTask {
    public zzfnk a;
    public final zzfnb b;

    public zzfnj(zzfnb zzfnbVar) {
        this.b = zzfnbVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        zzfnk zzfnkVar = this.a;
        if (zzfnkVar != null) {
            zzfnkVar.a(this);
        }
    }

    public final void b(zzfnk zzfnkVar) {
        this.a = zzfnkVar;
    }
}
