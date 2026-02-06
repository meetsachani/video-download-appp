package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfyd {
    public final Object a;
    public final Object b;
    public final Object c;

    public zzfyd(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.a;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(obj3);
        String valueOf4 = String.valueOf(obj);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
