package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.Ex  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2898Ex {
    public static final int b = -1;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final C2898Ex f = new a().d(0).b();
    public static final C2898Ex g = new a().d(1).b();
    public LinkedHashSet<InterfaceC5450bx> a;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Ex$b */
    /* loaded from: classes.dex */
    public @interface b {
    }

    public C2898Ex(LinkedHashSet<InterfaceC5450bx> linkedHashSet) {
        this.a = linkedHashSet;
    }

    public LinkedHashSet<InterfaceC7402jx> a(LinkedHashSet<InterfaceC7402jx> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC7402jx> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        List<InterfaceC6420fx> b2 = b(arrayList);
        LinkedHashSet<InterfaceC7402jx> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC7402jx> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC7402jx next = it2.next();
            if (b2.contains(next.c())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }

    public List<InterfaceC6420fx> b(List<InterfaceC6420fx> list) {
        List<InterfaceC6420fx> arrayList = new ArrayList<>(list);
        Iterator<InterfaceC5450bx> it = this.a.iterator();
        while (it.hasNext()) {
            arrayList = it.next().b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<InterfaceC5450bx> c() {
        return this.a;
    }

    public Integer d() {
        Iterator<InterfaceC5450bx> it = this.a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC5450bx next = it.next();
            if (next instanceof C9028qZ0) {
                Integer valueOf = Integer.valueOf(((C9028qZ0) next).c());
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public InterfaceC7402jx e(LinkedHashSet<InterfaceC7402jx> linkedHashSet) {
        Iterator<InterfaceC7402jx> it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: o.Ex$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final LinkedHashSet<InterfaceC5450bx> a;

        public a() {
            this.a = new LinkedHashSet<>();
        }

        public static a c(C2898Ex c2898Ex) {
            return new a(c2898Ex.c());
        }

        public a a(InterfaceC5450bx interfaceC5450bx) {
            this.a.add(interfaceC5450bx);
            return this;
        }

        public C2898Ex b() {
            return new C2898Ex(this.a);
        }

        public a d(int i) {
            boolean z;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The specified lens facing is invalid.");
            this.a.add(new C9028qZ0(i));
            return this;
        }

        public a(LinkedHashSet<InterfaceC5450bx> linkedHashSet) {
            this.a = new LinkedHashSet<>(linkedHashSet);
        }
    }
}
