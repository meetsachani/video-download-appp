package o;

import java.nio.ByteBuffer;

/* renamed from: o.eq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6149eq {
    public static final AbstractC6149eq a = new a();

    /* renamed from: o.eq$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC6149eq {
        @Override // o.AbstractC6149eq
        public AbstractC10391w8 a(int i) {
            return AbstractC10391w8.j(ByteBuffer.allocateDirect(i));
        }

        @Override // o.AbstractC6149eq
        public AbstractC10391w8 b(int i) {
            return AbstractC10391w8.k(new byte[i]);
        }
    }

    public static AbstractC6149eq c() {
        return a;
    }

    public abstract AbstractC10391w8 a(int i);

    public abstract AbstractC10391w8 b(int i);
}
