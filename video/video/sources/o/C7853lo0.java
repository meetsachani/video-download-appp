package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/* renamed from: o.lo0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7853lo0<T> extends K0<String, String, EQ1<T>, T> {
    public Comparator<String> Y0;

    public C7853lo0(Locale locale) {
        super(locale);
        this.Y0 = null;
    }

    @Override // o.InterfaceC6142eo0
    /* renamed from: B */
    public void i(String str, InterfaceC8348nm<T, String> interfaceC8348nm) {
        this.Z.add(new EQ1(str, interfaceC8348nm, this.X));
    }

    public void D(Comparator<String> comparator) {
        this.Y0 = comparator;
    }

    @Override // o.InterfaceC6142eo0
    public String[] f(T t) throws XR {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList(this.Y.keySet());
        for (final C c : this.Z) {
            InterfaceC7846lm1 interfaceC7846lm1 = (InterfaceC7846lm1) c.f().m(t);
            if (interfaceC7846lm1 != null && !interfaceC7846lm1.isEmpty()) {
                arrayList.addAll((Collection) interfaceC7846lm1.r().stream().map(new C6385fo0()).filter(new Predicate() { // from class: o.go0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return VH.this.e((String) obj);
                    }
                }).collect(Collectors.toList()));
            } else if (c.f().l()) {
                linkedList.add(c.f().i());
            }
        }
        if (linkedList.isEmpty()) {
            arrayList.sort(this.Y0);
            return (String[]) arrayList.toArray(C4206Se.u);
        }
        throw new XR(t.getClass(), linkedList, String.format(ResourceBundle.getBundle(UI0.k, this.X).getString("header.required.field.absent"), linkedList.stream().map(new C6883ho0()).collect(Collectors.joining(C4500Ve2.b)), C3455Kl2.a(C4500Ve2.b, arrayList)));
    }

    public List<C8114mo0<T>> w(String[] strArr) {
        List<String> list = (List) this.Y.entrySet().stream().filter(new Predicate() { // from class: o.io0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l;
                l = ((InterfaceC8348nm) ((Map.Entry) obj).getValue()).l();
                return l;
            }
        }).map(new C6385fo0()).collect(Collectors.toCollection(new Supplier() { // from class: o.jo0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedList();
            }
        }));
        List<VH> list2 = (List) this.Z.stream().filter(new Predicate() { // from class: o.ko0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean l;
                l = ((EQ1) obj).f().l();
                return l;
            }
        }).collect(Collectors.toList());
        for (String str : strArr) {
            if (!list.remove(str.toUpperCase())) {
                ListIterator listIterator = list2.listIterator();
                boolean z = false;
                while (!z && listIterator.hasNext()) {
                    if (((VH) listIterator.next()).e(str)) {
                        listIterator.remove();
                        z = true;
                    }
                }
            }
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : list) {
            linkedList.add(new C8114mo0(str2, (InterfaceC8348nm) this.Y.get(str2), false));
        }
        for (VH vh : list2) {
            linkedList.add(new C8114mo0((String) vh.h(), vh.f(), true));
        }
        return linkedList;
    }
}
