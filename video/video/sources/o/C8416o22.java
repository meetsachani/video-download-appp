package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.o22  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8416o22<T> implements InterfaceC5884dk0<Set<T>> {
    public static final InterfaceC5884dk0<Set<Object>> c = C10464wQ0.a(Collections.EMPTY_SET);
    public final List<InterfaceC6272fK1<T>> a;
    public final List<InterfaceC6272fK1<Collection<T>>> b;

    /* renamed from: o.o22$b */
    /* loaded from: classes2.dex */
    public static final class b<T> {
        public static final /* synthetic */ boolean c = false;
        public final List<InterfaceC6272fK1<T>> a;
        public final List<InterfaceC6272fK1<Collection<T>>> b;

        public b<T> a(InterfaceC6272fK1<? extends Collection<? extends T>> interfaceC6272fK1) {
            this.b.add(interfaceC6272fK1);
            return this;
        }

        public b<T> b(InterfaceC6272fK1<? extends T> interfaceC6272fK1) {
            this.a.add(interfaceC6272fK1);
            return this;
        }

        public C8416o22<T> c() {
            return new C8416o22<>(this.a, this.b);
        }

        public b(int i, int i2) {
            this.a = YT.e(i);
            this.b = YT.e(i2);
        }
    }

    public static <T> b<T> a(int i, int i2) {
        return new b<>(i, i2);
    }

    public static <T> InterfaceC5884dk0<Set<T>> b() {
        return (InterfaceC5884dk0<Set<T>>) c;
    }

    @Override // o.InterfaceC6272fK1
    /* renamed from: c */
    public Set<T> get() {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(this.b.size());
        int size2 = this.b.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = this.b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet c2 = YT.c(size);
        int size3 = this.a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            c2.add(C10421wF1.b(this.a.get(i2).get()));
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                c2.add(C10421wF1.b(obj));
            }
        }
        return Collections.unmodifiableSet(c2);
    }

    public C8416o22(List<InterfaceC6272fK1<T>> list, List<InterfaceC6272fK1<Collection<T>>> list2) {
        this.a = list;
        this.b = list2;
    }
}
