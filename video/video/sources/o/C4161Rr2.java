package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.Rr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4161Rr2 {
    public final List<a<?, ?>> a = new ArrayList();

    /* renamed from: o.Rr2$a */
    /* loaded from: classes.dex */
    public static final class a<Z, R> {
        public final Class<Z> a;
        public final Class<R> b;
        public final InterfaceC9502sT1<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, InterfaceC9502sT1<Z, R> interfaceC9502sT1) {
            this.a = cls;
            this.b = cls2;
            this.c = interfaceC9502sT1;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            if (this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b)) {
                return true;
            }
            return false;
        }
    }

    public synchronized <Z, R> InterfaceC9502sT1<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C8448oA2.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (InterfaceC9502sT1<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, InterfaceC9502sT1<Z, R> interfaceC9502sT1) {
        this.a.add(new a<>(cls, cls2, interfaceC9502sT1));
    }
}
