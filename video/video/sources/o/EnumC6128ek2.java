package o;

import o.C9740tS0;

/* renamed from: o.ek2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC6128ek2 implements C9740tS0.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final int Z0 = 0;
    public static final int a1 = 1;
    public static final C9740tS0.d<EnumC6128ek2> b1 = new C9740tS0.d<EnumC6128ek2>() { // from class: o.ek2.a
        @Override // o.C9740tS0.d
        /* renamed from: b */
        public EnumC6128ek2 a(int i) {
            return EnumC6128ek2.e(i);
        }
    };
    public final int X;

    /* renamed from: o.ek2$b */
    /* loaded from: classes.dex */
    public static final class b implements C9740tS0.e {
        public static final C9740tS0.e a = new b();

        @Override // o.C9740tS0.e
        public boolean a(int i) {
            if (EnumC6128ek2.e(i) != null) {
                return true;
            }
            return false;
        }
    }

    EnumC6128ek2(int i) {
        this.X = i;
    }

    public static EnumC6128ek2 e(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return SYNTAX_PROTO3;
        }
        return SYNTAX_PROTO2;
    }

    public static C9740tS0.d<EnumC6128ek2> g() {
        return b1;
    }

    public static C9740tS0.e h() {
        return b.a;
    }

    @Deprecated
    public static EnumC6128ek2 i(int i) {
        return e(i);
    }

    @Override // o.C9740tS0.c
    public final int k() {
        if (this != UNRECOGNIZED) {
            return this.X;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
