package o;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

@InterfaceC11149zF0
@InterfaceC8301na0
/* renamed from: o.nt0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8377nt0 implements Closeable {
    public static final String Z0 = "com.google.common.base.internal.Finalizer";
    public final ReferenceQueue<Object> X;
    public final PhantomReference<Object> Y;
    public final boolean Z;
    public static final Logger Y0 = Logger.getLogger(C8377nt0.class.getName());
    public static final Method a1 = f(h(new d(), new a(), new b()));

    /* renamed from: o.nt0$a */
    /* loaded from: classes3.dex */
    public static class a implements c {
        public static final String a = "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.";

        @Override // o.C8377nt0.c
        @MB
        public Class<?> a() {
            try {
                return c(b()).loadClass(C8377nt0.Z0);
            } catch (Exception e) {
                C8377nt0.Y0.log(Level.WARNING, a, (Throwable) e);
                return null;
            }
        }

        public URL b() throws IOException {
            String str;
            String concat = String.valueOf(C8377nt0.Z0.replace('.', '/')).concat(C6497gD.d);
            URL resource = getClass().getClassLoader().getResource(concat);
            if (resource != null) {
                String url = resource.toString();
                if (!url.endsWith(concat)) {
                    if (url.length() != 0) {
                        str = "Unsupported path style: ".concat(url);
                    } else {
                        str = new String("Unsupported path style: ");
                    }
                    throw new IOException(str);
                }
                return new URL(resource, url.substring(0, url.length() - concat.length()));
            }
            throw new FileNotFoundException(concat);
        }

        public URLClassLoader c(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* renamed from: o.nt0$b */
    /* loaded from: classes3.dex */
    public static class b implements c {
        @Override // o.C8377nt0.c
        public Class<?> a() {
            try {
                return Class.forName("o.qt0");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: o.nt0$c */
    /* loaded from: classes3.dex */
    public interface c {
        @MB
        Class<?> a();
    }

    /* renamed from: o.nt0$d */
    /* loaded from: classes3.dex */
    public static class d implements c {
        @InterfaceC5299bJ2
        public static boolean a;

        @Override // o.C8377nt0.c
        @MB
        public Class<?> a() {
            if (a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(C8377nt0.Z0);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                C8377nt0.Y0.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public C8377nt0() {
        boolean z;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.X = referenceQueue;
        PhantomReference<Object> phantomReference = new PhantomReference<>(this, referenceQueue);
        this.Y = phantomReference;
        try {
            a1.invoke(null, InterfaceC8134mt0.class, referenceQueue, phantomReference);
            z = true;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            Y0.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.Z = z;
    }

    public static Method f(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }

    public static Class<?> h(c... cVarArr) {
        for (c cVar : cVarArr) {
            Class<?> a2 = cVar.a();
            if (a2 != null) {
                return a2;
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Y.enqueue();
        d();
    }

    public void d() {
        if (this.Z) {
            return;
        }
        while (true) {
            Reference<? extends Object> poll = this.X.poll();
            if (poll != null) {
                poll.clear();
                try {
                    ((InterfaceC8134mt0) poll).a();
                } catch (Throwable th) {
                    Y0.log(Level.SEVERE, "Error cleaning up after reference.", th);
                }
            } else {
                return;
            }
        }
    }
}
