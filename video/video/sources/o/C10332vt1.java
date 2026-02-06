package o;

import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/* renamed from: o.vt1 */
/* loaded from: classes4.dex */
public class C10332vt1 implements Predicate<ObjectStreamClass> {
    public final List<InterfaceC5999eD> a = new ArrayList();
    public final List<InterfaceC5999eD> b = new ArrayList();

    public static /* synthetic */ C9668tA0 a(Class cls) {
        return new C9668tA0(cls.getName());
    }

    public static /* synthetic */ C9668tA0 b(Class cls) {
        return new C9668tA0(cls.getName());
    }

    public C10332vt1 c(Pattern pattern) {
        this.a.add(new GQ1(pattern));
        return this;
    }

    public C10332vt1 d(InterfaceC5999eD interfaceC5999eD) {
        this.a.add(interfaceC5999eD);
        return this;
    }

    public C10332vt1 e(Class<?>... clsArr) {
        Stream map = Stream.of((Object[]) clsArr).map(new Function() { // from class: o.qt1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C10332vt1.b((Class) obj);
            }
        });
        List<InterfaceC5999eD> list = this.a;
        Objects.requireNonNull(list);
        map.forEach(new C9357rt1(list));
        return this;
    }

    public C10332vt1 f(String... strArr) {
        Stream map = Stream.of((Object[]) strArr).map(new C9843tt1());
        List<InterfaceC5999eD> list = this.a;
        Objects.requireNonNull(list);
        map.forEach(new C10086ut1(list));
        return this;
    }

    public C10332vt1 g(Pattern pattern) {
        this.b.add(new GQ1(pattern));
        return this;
    }

    public C10332vt1 h(InterfaceC5999eD interfaceC5999eD) {
        this.b.add(interfaceC5999eD);
        return this;
    }

    public C10332vt1 i(Class<?>... clsArr) {
        Stream map = Stream.of((Object[]) clsArr).map(new Function() { // from class: o.st1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C10332vt1.a((Class) obj);
            }
        });
        List<InterfaceC5999eD> list = this.b;
        Objects.requireNonNull(list);
        map.forEach(new C9357rt1(list));
        return this;
    }

    public C10332vt1 j(String... strArr) {
        Stream map = Stream.of((Object[]) strArr).map(new C9843tt1());
        List<InterfaceC5999eD> list = this.b;
        Objects.requireNonNull(list);
        map.forEach(new C10086ut1(list));
        return this;
    }

    @Override // java.util.function.Predicate
    /* renamed from: k */
    public boolean test(ObjectStreamClass objectStreamClass) {
        return l(objectStreamClass.getName());
    }

    public boolean l(String str) {
        for (InterfaceC5999eD interfaceC5999eD : this.b) {
            if (interfaceC5999eD.a(str)) {
                return false;
            }
        }
        for (InterfaceC5999eD interfaceC5999eD2 : this.a) {
            if (interfaceC5999eD2.a(str)) {
                return true;
            }
        }
        return false;
    }
}
