package o;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class ME1<T> extends L0<String, Integer, T> implements Iterable<C9087qo0<T>> {
    public final List<QN1<Integer>> Y0;
    public final String Z;

    /* loaded from: classes3.dex */
    public class a implements Iterator<C9087qo0<T>> {
        public ListIterator<QN1<Integer>> X;
        public QN1<Integer> Y;
        public int Z;

        public a() {
            ME1.this = r2;
            if (r2.Y0.isEmpty()) {
                this.Z = -1;
                return;
            }
            ListIterator<QN1<Integer>> listIterator = r2.Y0.listIterator();
            this.X = listIterator;
            QN1<Integer> next = listIterator.next();
            this.Y = next;
            this.Z = next.i().intValue();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public C9087qo0<T> next() {
            if (hasNext()) {
                C9087qo0<T> c9087qo0 = new C9087qo0<>(this.Z, ME1.this.X);
                if (this.Z != this.Y.h().intValue() && Integer.MAX_VALUE != this.Y.h().intValue()) {
                    this.Z++;
                    return c9087qo0;
                } else if (!this.X.hasNext()) {
                    this.Z = -1;
                    return c9087qo0;
                } else {
                    QN1<Integer> next = this.X.next();
                    this.Y = next;
                    this.Z = next.i().intValue();
                    return c9087qo0;
                }
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Z != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ME1(String str, int i, InterfaceC8348nm<T, Integer> interfaceC8348nm, Locale locale) {
        super(interfaceC8348nm, locale);
        QN1<Integer> k;
        boolean z;
        Integer valueOf;
        this.Z = str;
        this.Y0 = new LinkedList();
        if (!C4500Ve2.H0(str)) {
            String[] split = str.split(",");
            try {
                int length = split.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    String str2 = split[i3];
                    if (C4500Ve2.N0(str2)) {
                        boolean z2 = true;
                        if (str2.contains("-")) {
                            String[] split2 = str2.split("-", 2);
                            if (C4500Ve2.I0(split2[i2])) {
                                valueOf = Integer.valueOf(i2);
                            } else {
                                valueOf = Integer.valueOf(split2[i2].trim());
                            }
                            Integer valueOf2 = Integer.valueOf(i);
                            if (split2.length == 2 && C4500Ve2.N0(split2[1])) {
                                valueOf2 = Integer.valueOf(split2[1].trim());
                            }
                            if (valueOf2.intValue() >= i) {
                                if (valueOf.intValue() >= i) {
                                    valueOf2 = valueOf;
                                } else {
                                    valueOf2 = Integer.valueOf(i);
                                }
                            }
                            k = QN1.a(valueOf, valueOf2);
                        } else {
                            k = QN1.k(Integer.valueOf(str2));
                        }
                        ListIterator<QN1<Integer>> listIterator = this.Y0.listIterator();
                        boolean z3 = false;
                        while (listIterator.hasNext() && !z3) {
                            QN1<Integer> next = listIterator.next();
                            if (next.d(k)) {
                                z = z2;
                                z3 = z;
                            } else if (next.s(k)) {
                                z = z2;
                                k = QN1.a(Integer.valueOf(Math.min(next.i().intValue(), k.i().intValue())), Integer.valueOf(Math.max(next.h().intValue(), k.h().intValue())));
                                listIterator.remove();
                            } else {
                                z = z2;
                                if (next.h().intValue() + 1 == k.i().intValue()) {
                                    k = QN1.a(next.i(), k.h());
                                } else if (k.h().intValue() + 1 == next.i().intValue()) {
                                    k = QN1.a(k.i(), next.h());
                                }
                            }
                            z2 = z;
                        }
                        if (!z3) {
                            this.Y0.add(k);
                        }
                    }
                    i3++;
                    i2 = 0;
                }
                return;
            } catch (NumberFormatException e) {
                C8027mR c8027mR = new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, this.Y).getString("invalid.range.definition"), str));
                c8027mR.initCause(e);
                throw c8027mR;
            }
        }
        throw new C8027mR(AbstractC8592om.class, String.format(ResourceBundle.getBundle(UI0.k, this.Y).getString("invalid.range.definition"), str));
    }

    public static /* synthetic */ boolean i(Integer num, QN1 qn1) {
        return qn1.c(num);
    }

    @Override // java.lang.Iterable
    public Iterator<C9087qo0<T>> iterator() {
        return new a();
    }

    public void k(int i) {
        ListIterator<QN1<Integer>> listIterator = this.Y0.listIterator();
        while (listIterator.hasNext()) {
            QN1<Integer> next = listIterator.next();
            if (next.h().intValue() > i) {
                if (next.i().intValue() > i) {
                    listIterator.set(QN1.k(next.i()));
                } else {
                    listIterator.set(QN1.a(next.i(), Integer.valueOf(i)));
                }
            }
        }
    }

    @Override // o.VH
    /* renamed from: l */
    public boolean e(final Integer num) {
        return this.Y0.stream().anyMatch(new Predicate() { // from class: o.LE1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ME1.i(num, (QN1) obj);
            }
        });
    }

    @Override // o.VH
    /* renamed from: p */
    public String h() {
        return this.Z;
    }
}
