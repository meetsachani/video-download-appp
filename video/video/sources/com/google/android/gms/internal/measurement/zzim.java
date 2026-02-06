package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzis;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class zzim<T extends zzis<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract zziq<T> b(Object obj);

    public abstract Object c(zzik zzikVar, zzkj zzkjVar, int i);

    public abstract <UT, UB> UB d(Object obj, zzlc zzlcVar, Object obj2, zzik zzikVar, zziq<T> zziqVar, UB ub, zzma<UT, UB> zzmaVar) throws IOException;

    public abstract void e(zzhm zzhmVar, Object obj, zzik zzikVar, zziq<T> zziqVar) throws IOException;

    public abstract void f(zzlc zzlcVar, Object obj, zzik zzikVar, zziq<T> zziqVar) throws IOException;

    public abstract void g(zzmw zzmwVar, Map.Entry<?, ?> entry) throws IOException;

    public abstract boolean h(zzkj zzkjVar);

    public abstract zziq<T> i(Object obj);

    public abstract void j(Object obj);
}
