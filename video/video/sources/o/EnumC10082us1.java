package o;

import o.C9740tS0;

/* renamed from: o.us1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC10082us1 implements C9740tS0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final int Y0 = 0;
    public static final C9740tS0.d<EnumC10082us1> Z0 = new C9740tS0.d<EnumC10082us1>() { // from class: o.us1.a
        @Override // o.C9740tS0.d
        /* renamed from: b */
        public EnumC10082us1 a(int i) {
            return EnumC10082us1.e(i);
        }
    };
    public final int X;

    /* renamed from: o.us1$b */
    /* loaded from: classes.dex */
    public static final class b implements C9740tS0.e {
        public static final C9740tS0.e a = new b();

        @Override // o.C9740tS0.e
        public boolean a(int i) {
            if (EnumC10082us1.e(i) != null) {
                return true;
            }
            return false;
        }
    }

    EnumC10082us1(int i) {
        this.X = i;
    }

    public static EnumC10082us1 e(int i) {
        if (i != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static C9740tS0.d<EnumC10082us1> g() {
        return Z0;
    }

    public static C9740tS0.e h() {
        return b.a;
    }

    @Deprecated
    public static EnumC10082us1 i(int i) {
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
