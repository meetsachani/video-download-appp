package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public interface zzaq {
    public static final zzaq i = new zzax();
    public static final zzaq j = new zzao();
    public static final zzaq k = new zzaj("continue");
    public static final zzaq l = new zzaj("break");
    public static final zzaq m = new zzaj("return");
    public static final zzaq n = new zzag(Boolean.TRUE);

    /* renamed from: o  reason: collision with root package name */
    public static final zzaq f304o = new zzag(Boolean.FALSE);
    public static final zzaq p = new zzas("");

    zzaq c();

    Double d();

    String e();

    Boolean f();

    Iterator<zzaq> h();

    zzaq i(String str, zzh zzhVar, List<zzaq> list);
}
