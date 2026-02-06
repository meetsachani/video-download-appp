package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import o.C8844po0;

/* renamed from: o.po0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8844po0<T> extends K0<String, Integer, ME1<T>, T> implements Iterable<C9087qo0<T>> {
    public int Y0;
    public Comparator<Integer> Z0;

    /* renamed from: o.po0$a */
    /* loaded from: classes3.dex */
    public class a extends UY0<C9087qo0<T>> {
        public a() {
        }

        public static /* synthetic */ C9087qo0 d(Map.Entry entry) {
            return new C9087qo0(((Integer) entry.getKey()).intValue(), (InterfaceC8348nm) entry.getValue());
        }

        @Override // o.UY0
        public Iterator<C9087qo0<T>> b(int i) {
            if (i <= C8844po0.this.Z.size()) {
                return ((ME1) C8844po0.this.Z.get(i - 1)).iterator();
            }
            if (i == C8844po0.this.Z.size() + 1) {
                return new C4552Vr2(C8844po0.this.Y.entrySet().iterator(), new InterfaceC3287Is2() { // from class: o.oo0
                    @Override // o.InterfaceC3287Is2
                    public final Object a(Object obj) {
                        return C8844po0.a.d((Map.Entry) obj);
                    }
                });
            }
            return null;
        }
    }

    public C8844po0(Locale locale) {
        super(locale);
        this.Y0 = Integer.MAX_VALUE;
        this.Z0 = null;
    }

    public void B(final int i) {
        this.Y0 = i;
        this.Z.forEach(new Consumer() { // from class: o.no0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ME1) obj).k(i);
            }
        });
    }

    @Override // o.InterfaceC6142eo0
    public String[] f(T t) throws XR {
        int i;
        int intValue;
        int intValue2;
        LinkedList linkedList = new LinkedList();
        TreeMap treeMap = new TreeMap(this.Z0);
        for (Map.Entry entry : this.Y.entrySet()) {
            treeMap.put(entry.getKey(), ((InterfaceC8348nm) entry.getValue()).i().getName());
        }
        Iterator it = this.Z.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            VH vh = (VH) it.next();
            InterfaceC7846lm1 interfaceC7846lm1 = (InterfaceC7846lm1) vh.f().m(t);
            if (interfaceC7846lm1 != null && !interfaceC7846lm1.isEmpty()) {
                for (Map.Entry entry2 : interfaceC7846lm1.r()) {
                    if (vh.e((Integer) entry2.getKey())) {
                        treeMap.put(entry2.getKey(), vh.f().i().getName());
                        i = 1;
                    }
                }
            }
            if (interfaceC7846lm1 == null || interfaceC7846lm1.isEmpty() || i == 0) {
                if (vh.f().l()) {
                    linkedList.add(vh.f().i());
                }
            }
        }
        TreeSet<Integer> treeSet = new TreeSet(treeMap.keySet());
        if (treeSet.isEmpty()) {
            intValue = 0;
        } else {
            intValue = ((Integer) treeSet.last()).intValue() + 1;
        }
        String[] strArr = new String[intValue];
        if (treeSet.isEmpty()) {
            intValue2 = 0;
        } else {
            intValue2 = ((Integer) treeSet.first()).intValue();
        }
        for (Integer num : treeSet) {
            for (int i2 = intValue2 + 1; i2 < num.intValue(); i2++) {
                treeMap.put(Integer.valueOf(i2), null);
            }
            intValue2 = num.intValue();
        }
        for (String str : treeMap.values()) {
            strArr[i] = str;
            i++;
        }
        if (linkedList.isEmpty()) {
            return strArr;
        }
        throw new XR(t.getClass(), linkedList, String.format(ResourceBundle.getBundle(UI0.k, this.X).getString("header.required.field.absent"), linkedList.stream().map(new C6883ho0()).collect(Collectors.joining(C4500Ve2.b)), M80.a(C4500Ve2.b, strArr)));
    }

    @Override // java.lang.Iterable
    public Iterator<C9087qo0<T>> iterator() {
        return new a();
    }

    @Override // o.InterfaceC6142eo0
    /* renamed from: r */
    public void i(String str, InterfaceC8348nm<T, Integer> interfaceC8348nm) {
        this.Z.add(new ME1(str, this.Y0, interfaceC8348nm, this.X));
    }

    public void w(Comparator<Integer> comparator) {
        this.Z0 = comparator;
    }
}
