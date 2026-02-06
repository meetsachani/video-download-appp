package o;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.He0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3131He0<L> implements Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    public List<L> X;
    public transient L Y;
    public transient L[] Z;

    /* renamed from: o.He0$a */
    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {
        public a() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            for (Object obj2 : C3131He0.this.X) {
                method.invoke(obj2, objArr);
            }
            return null;
        }
    }

    public C3131He0(Class<L> cls) {
        this(cls, Thread.currentThread().getContextClassLoader());
    }

    public static <T> C3131He0<T> d(Class<T> cls) {
        return new C3131He0<>(cls);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object[] objArr = (Object[]) objectInputStream.readObject();
        this.X = new CopyOnWriteArrayList(objArr);
        j(objArr.getClass().getComponentType(), Thread.currentThread().getContextClassLoader());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (L l : this.X) {
            try {
                objectOutputStream2.writeObject(l);
                arrayList.add(l);
            } catch (IOException unused) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.Z));
    }

    public void b(L l) {
        c(l, true);
    }

    public void c(L l, boolean z) {
        C11147zE2.V(l, ServiceSpecificExtraArgs.CastExtraArgs.a, new Object[0]);
        if (!z && this.X.contains(l)) {
            return;
        }
        this.X.add(l);
    }

    public InvocationHandler e() {
        return new a();
    }

    public final void f(Class<L> cls, ClassLoader classLoader) {
        this.Y = cls.cast(Proxy.newProxyInstance(classLoader, new Class[]{cls}, e()));
    }

    public L g() {
        return this.Y;
    }

    public int h() {
        return this.X.size();
    }

    public L[] i() {
        return (L[]) this.X.toArray(this.Z);
    }

    public final void j(Class<L> cls, ClassLoader classLoader) {
        this.Z = (L[]) ((Object[]) Array.newInstance((Class<?>) cls, 0));
        f(cls, classLoader);
    }

    public void k(L l) {
        C11147zE2.V(l, ServiceSpecificExtraArgs.CastExtraArgs.a, new Object[0]);
        this.X.remove(l);
    }

    public C3131He0(Class<L> cls, ClassLoader classLoader) {
        this();
        C11147zE2.V(cls, "listenerInterface", new Object[0]);
        C11147zE2.V(classLoader, "classLoader", new Object[0]);
        C11147zE2.B(cls.isInterface(), "Class %s is not an interface", cls.getName());
        j(cls, classLoader);
    }

    public C3131He0() {
        this.X = new CopyOnWriteArrayList();
    }
}
