package o;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.k0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7415k0<T> implements InterfaceC10161vC<T> {
    public static final String c = "open";
    public final AtomicReference<b> a = new AtomicReference<>(b.X);
    public final PropertyChangeSupport b = new PropertyChangeSupport(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: o.k0$b */
    /* loaded from: classes4.dex */
    public static abstract class b {
        public static final b X;
        public static final b Y;
        public static final /* synthetic */ b[] Z;

        /* renamed from: o.k0$b$a */
        /* loaded from: classes4.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i);
            }

            @Override // o.AbstractC7415k0.b
            public b e() {
                return b.Y;
            }
        }

        /* renamed from: o.k0$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public enum C0298b extends b {
            public C0298b(String str, int i) {
                super(str, i);
            }

            @Override // o.AbstractC7415k0.b
            public b e() {
                return b.X;
            }
        }

        static {
            a aVar = new a("CLOSED", 0);
            X = aVar;
            C0298b c0298b = new C0298b("OPEN", 1);
            Y = c0298b;
            Z = new b[]{aVar, c0298b};
        }

        public b(String str, int i) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Z.clone();
        }

        public abstract b e();
    }

    public static boolean e(b bVar) {
        if (bVar == b.Y) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10161vC
    public abstract boolean a();

    @Override // o.InterfaceC10161vC
    public abstract boolean b(T t);

    public void c(PropertyChangeListener propertyChangeListener) {
        this.b.addPropertyChangeListener(propertyChangeListener);
    }

    @Override // o.InterfaceC10161vC
    public void close() {
        d(b.X);
    }

    public void d(b bVar) {
        if (C6515gH1.a(this.a, bVar.e(), bVar)) {
            this.b.firePropertyChange("open", !e(bVar), e(bVar));
        }
    }

    public void f(PropertyChangeListener propertyChangeListener) {
        this.b.removePropertyChangeListener(propertyChangeListener);
    }

    @Override // o.InterfaceC10161vC
    public boolean isClosed() {
        return !isOpen();
    }

    @Override // o.InterfaceC10161vC
    public boolean isOpen() {
        return e(this.a.get());
    }

    @Override // o.InterfaceC10161vC
    public void open() {
        d(b.Y);
    }
}
