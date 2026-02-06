package o;

import java.io.Closeable;
import java.util.concurrent.Executor;
import o.AbstractC7335jg0;
import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.jg0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7335jg0 extends AbstractC7762lQ implements Closeable, AutoCloseable {
    @NotNull
    public static final a Z = new a(null);

    @InterfaceC4912Zi0
    /* renamed from: o.jg0$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC9870u0<AbstractC7762lQ, AbstractC7335jg0> {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ AbstractC7335jg0 c(InterfaceC5809dQ.b bVar) {
            return d(bVar);
        }

        public static final AbstractC7335jg0 d(InterfaceC5809dQ.b bVar) {
            if (bVar instanceof AbstractC7335jg0) {
                return (AbstractC7335jg0) bVar;
            }
            return null;
        }

        public a() {
            super(AbstractC7762lQ.Y, new HA0() { // from class: o.ig0
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    return AbstractC7335jg0.a.c((InterfaceC5809dQ.b) obj);
                }
            });
        }
    }

    @NotNull
    public abstract Executor b0();

    public abstract void close();
}
