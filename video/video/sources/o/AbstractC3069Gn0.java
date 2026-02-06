package o;

import java.util.List;

/* renamed from: o.Gn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3069Gn0 {
    public final List<C6302fS> a;

    /* renamed from: o.Gn0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3069Gn0 {
        public final long b;
        public final long c;
        public final boolean d;

        public /* synthetic */ a(List list, long j, long j2, boolean z, C9516sY c9516sY) {
            this(list, j, j2, z);
        }

        @Override // o.AbstractC3069Gn0
        public AbstractC3069Gn0 b(YD1 yd1) {
            C6562gT0.p(yd1, "f");
            List i = C7979mF.i();
            int size = a().size();
            for (int i2 = 0; i2 < size; i2++) {
                i.add(a().get(i2).v(yd1));
            }
            return new a(C7979mF.a(i), UD1.q(this.b, yd1), UD1.q(this.c, yd1), this.d, null);
        }

        public final boolean c() {
            return this.d;
        }

        public final long d() {
            return this.c;
        }

        public final long e() {
            return this.b;
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) C7638kv0.l(this.b)) + ", center=" + ((Object) C7638kv0.l(this.c)) + ", convex=" + this.d;
        }

        public /* synthetic */ a(List list, long j, long j2, boolean z, int i, C9516sY c9516sY) {
            this(list, j, j2, (i & 8) != 0 ? true : z, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<? extends C6302fS> list, long j, long j2, boolean z) {
            super(list);
            C6562gT0.p(list, "cubics");
            this.b = j;
            this.c = j2;
            this.d = z;
        }
    }

    /* renamed from: o.Gn0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3069Gn0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<? extends C6302fS> list) {
            super(list);
            C6562gT0.p(list, "cubics");
        }

        @Override // o.AbstractC3069Gn0
        /* renamed from: c */
        public b b(YD1 yd1) {
            C6562gT0.p(yd1, "f");
            List i = C7979mF.i();
            int size = a().size();
            for (int i2 = 0; i2 < size; i2++) {
                i.add(a().get(i2).v(yd1));
            }
            return new b(C7979mF.a(i));
        }

        public String toString() {
            return "Edge";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3069Gn0(List<? extends C6302fS> list) {
        C6562gT0.p(list, "cubics");
        this.a = list;
    }

    public final List<C6302fS> a() {
        return this.a;
    }

    public abstract AbstractC3069Gn0 b(YD1 yd1);
}
