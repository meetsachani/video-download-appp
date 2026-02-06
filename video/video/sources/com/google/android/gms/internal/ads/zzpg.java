package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpg extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ zzpj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpg(zzpj zzpjVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = zzpjVar;
        this.a = contentResolver;
        this.b = uri;
    }

    public final void a() {
        this.a.registerContentObserver(this.b, false, this);
    }

    public final void b() {
        this.a.unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        zze zzeVar;
        zzpk zzpkVar;
        zzpj zzpjVar = this.c;
        context = zzpjVar.a;
        zzeVar = zzpjVar.h;
        zzpkVar = zzpjVar.g;
        zzpjVar.j(zzpe.c(context, zzeVar, zzpkVar));
    }
}
