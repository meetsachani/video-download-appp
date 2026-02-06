package o;

import androidx.lifecycle.LiveData;
import java.util.Objects;
import o.AbstractC3007Fx;
import o.InterfaceC7402jx;

/* renamed from: o.Gx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3105Gx {
    public static final String c = "CameraStateMachine";
    public final C3399Jx a;
    public final C7364jn1<AbstractC3007Fx> b;

    /* renamed from: o.Gx$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC7402jx.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC7402jx.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC7402jx.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[InterfaceC7402jx.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[InterfaceC7402jx.a.CONFIGURED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InterfaceC7402jx.a.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[InterfaceC7402jx.a.RELEASING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[InterfaceC7402jx.a.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[InterfaceC7402jx.a.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C3105Gx(C3399Jx c3399Jx) {
        this.a = c3399Jx;
        C7364jn1<AbstractC3007Fx> c7364jn1 = new C7364jn1<>();
        this.b = c7364jn1;
        c7364jn1.o(AbstractC3007Fx.a(AbstractC3007Fx.c.CLOSED));
    }

    public LiveData<AbstractC3007Fx> a() {
        return this.b;
    }

    public final AbstractC3007Fx b() {
        if (this.a.c()) {
            return AbstractC3007Fx.a(AbstractC3007Fx.c.OPENING);
        }
        return AbstractC3007Fx.a(AbstractC3007Fx.c.PENDING_OPEN);
    }

    public void c(InterfaceC7402jx.a aVar, AbstractC3007Fx.b bVar) {
        AbstractC3007Fx b;
        switch (a.a[aVar.ordinal()]) {
            case 1:
                b = b();
                break;
            case 2:
                b = AbstractC3007Fx.b(AbstractC3007Fx.c.OPENING, bVar);
                break;
            case 3:
            case 4:
                b = AbstractC3007Fx.b(AbstractC3007Fx.c.OPEN, bVar);
                break;
            case 5:
            case 6:
                b = AbstractC3007Fx.b(AbstractC3007Fx.c.CLOSING, bVar);
                break;
            case 7:
            case 8:
                b = AbstractC3007Fx.b(AbstractC3007Fx.c.CLOSED, bVar);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C7433k41.a(c, "New public camera state " + b + " from " + aVar + " and " + bVar);
        if (!Objects.equals(this.b.f(), b)) {
            C7433k41.a(c, "Publishing new public camera state " + b);
            this.b.o(b);
        }
    }
}
