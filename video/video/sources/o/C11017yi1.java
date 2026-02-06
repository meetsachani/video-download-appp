package o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import o.C10774xi1;

/* renamed from: o.yi1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11017yi1 implements InterfaceC5702cz1, LE0 {
    public final String d;
    public final C10774xi1 f;
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final List<InterfaceC5702cz1> e = new ArrayList();

    /* renamed from: o.yi1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C10774xi1.a.values().length];
            a = iArr;
            try {
                iArr[C10774xi1.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C10774xi1.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[C10774xi1.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[C10774xi1.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[C10774xi1.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C11017yi1(C10774xi1 c10774xi1) {
        this.d = c10774xi1.c();
        this.f = c10774xi1;
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        this.c.reset();
        if (this.f.d()) {
            return this.c;
        }
        int i = a.a[this.f.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c(Path.Op.XOR);
                        }
                    } else {
                        c(Path.Op.INTERSECT);
                    }
                } else {
                    c(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                c(Path.Op.UNION);
            }
        } else {
            a();
        }
        return this.c;
    }

    public final void a() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).Y());
        }
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).b(list, list2);
        }
    }

    public final void c(Path.Op op) {
        this.b.reset();
        this.a.reset();
        for (int size = this.e.size() - 1; size >= 1; size--) {
            InterfaceC5702cz1 interfaceC5702cz1 = this.e.get(size);
            if (interfaceC5702cz1 instanceof HL) {
                HL hl = (HL) interfaceC5702cz1;
                List<InterfaceC5702cz1> l = hl.l();
                for (int size2 = l.size() - 1; size2 >= 0; size2--) {
                    Path Y = l.get(size2).Y();
                    Y.transform(hl.m());
                    this.b.addPath(Y);
                }
            } else {
                this.b.addPath(interfaceC5702cz1.Y());
            }
        }
        InterfaceC5702cz1 interfaceC5702cz12 = this.e.get(0);
        if (interfaceC5702cz12 instanceof HL) {
            HL hl2 = (HL) interfaceC5702cz12;
            List<InterfaceC5702cz1> l2 = hl2.l();
            for (int i = 0; i < l2.size(); i++) {
                Path Y2 = l2.get(i).Y();
                Y2.transform(hl2.m());
                this.a.addPath(Y2);
            }
        } else {
            this.a.set(interfaceC5702cz12.Y());
        }
        this.c.op(this.a, this.b, op);
    }

    @Override // o.DL
    public String getName() {
        return this.d;
    }

    @Override // o.LE0
    public void i(ListIterator<DL> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            DL previous = listIterator.previous();
            if (previous instanceof InterfaceC5702cz1) {
                this.e.add((InterfaceC5702cz1) previous);
                listIterator.remove();
            }
        }
    }
}
