package o;

import android.os.Bundle;

/* renamed from: o.rT  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9257rT {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    /* renamed from: o.rT$a */
    /* loaded from: classes.dex */
    public static final class a {
        public Integer a;
        public Integer b;
        public Integer c;
        public Integer d;

        public C9257rT a() {
            return new C9257rT(this.a, this.b, this.c, this.d);
        }

        public a b(int i) {
            this.c = Integer.valueOf(i | (-16777216));
            return this;
        }

        public a c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public a e(int i) {
            this.a = Integer.valueOf(i | (-16777216));
            return this;
        }
    }

    public C9257rT(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public static C9257rT a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new C9257rT((Integer) bundle.get(C10229vT.k), (Integer) bundle.get(C10229vT.y), (Integer) bundle.get(C10229vT.S), (Integer) bundle.get(C10229vT.y0));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt(C10229vT.k, num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt(C10229vT.y, num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt(C10229vT.S, num3.intValue());
        }
        Integer num4 = this.d;
        if (num4 != null) {
            bundle.putInt(C10229vT.y0, num4.intValue());
        }
        return bundle;
    }

    public C9257rT c(C9257rT c9257rT) {
        Integer num = this.a;
        if (num == null) {
            num = c9257rT.a;
        }
        Integer num2 = this.b;
        if (num2 == null) {
            num2 = c9257rT.b;
        }
        Integer num3 = this.c;
        if (num3 == null) {
            num3 = c9257rT.c;
        }
        Integer num4 = this.d;
        if (num4 == null) {
            num4 = c9257rT.d;
        }
        return new C9257rT(num, num2, num3, num4);
    }
}
