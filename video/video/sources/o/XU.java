package o;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import o.InterfaceC10771xh2;
import o.VU1;

/* loaded from: classes.dex */
public class XU {
    public final InterfaceC10771xh2.c a;
    public final Context b;
    public final String c;
    public final VU1.d d;
    public final List<VU1.b> e;
    public final boolean f;
    public final VU1.c g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final Set<Integer> m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final File f662o;

    @Deprecated
    public XU(Context context, String str, InterfaceC10771xh2.c cVar, VU1.d dVar, List<VU1.b> list, boolean z, VU1.c cVar2, Executor executor, boolean z2, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor, false, z2, false, set, null, null);
    }

    public boolean a(int i, int i2) {
        Set<Integer> set;
        if ((i > i2 && this.l) || !this.k || ((set = this.m) != null && set.contains(Integer.valueOf(i)))) {
            return false;
        }
        return true;
    }

    @Deprecated
    public boolean b(int i) {
        return a(i, i + 1);
    }

    @Deprecated
    public XU(Context context, String str, InterfaceC10771xh2.c cVar, VU1.d dVar, List<VU1.b> list, boolean z, VU1.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z, cVar2, executor, executor2, z2, z3, z4, set, null, null);
    }

    public XU(Context context, String str, InterfaceC10771xh2.c cVar, VU1.d dVar, List<VU1.b> list, boolean z, VU1.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f = z;
        this.g = cVar2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
        this.n = str2;
        this.f662o = file;
    }
}
