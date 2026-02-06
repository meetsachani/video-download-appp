package o;

import android.os.Bundle;
import o.InterfaceC8368nr;

@Deprecated
/* renamed from: o.dO1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5803dO1 implements InterfaceC8368nr {
    public static final float X = -1.0f;
    public static final int Y = -1;
    public static final int Y0 = 1;
    public static final int Z = 0;
    public static final int Z0 = 2;
    public static final int a1 = 3;
    public static final String b1 = TD2.R0(0);
    public static final InterfaceC8368nr.a<AbstractC5803dO1> c1 = new InterfaceC8368nr.a() { // from class: o.cO1
        @Override // o.InterfaceC8368nr.a
        public final InterfaceC8368nr a(Bundle bundle) {
            AbstractC5803dO1 b;
            b = AbstractC5803dO1.b(bundle);
            return b;
        }
    };

    public static AbstractC5803dO1 b(Bundle bundle) {
        int i = bundle.getInt(b1, -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C9338ro2.i1.a(bundle);
                    }
                    throw new IllegalArgumentException("Unknown RatingType: " + i);
                }
                return C4886Zb2.j1.a(bundle);
            }
            return C10895yC1.g1.a(bundle);
        }
        return C8475oH0.i1.a(bundle);
    }

    public abstract boolean c();
}
