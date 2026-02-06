package o;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public class CR extends NR {
    public final List<PR> Z;

    public CR(PR pr) {
        LinkedList linkedList = new LinkedList();
        this.Z = linkedList;
        linkedList.add(pr);
    }

    public static /* synthetic */ void e(long j, PR pr) {
        pr.d(j);
    }

    public static /* synthetic */ void f(String[] strArr, PR pr) {
        pr.c(strArr);
    }

    @Override // o.NR
    public void c(final String[] strArr) {
        super.c(strArr);
        this.Z.forEach(new Consumer() { // from class: o.BR
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CR.f(strArr, (PR) obj);
            }
        });
    }

    @Override // o.NR
    public void d(final long j) {
        super.d(j);
        this.Z.forEach(new Consumer() { // from class: o.AR
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CR.e(j, (PR) obj);
            }
        });
    }

    public void g(PR pr) {
        this.Z.add(pr);
    }

    public List<PR> h() {
        return this.Z;
    }

    public PR i() {
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.get(0);
    }

    public boolean j() {
        if (this.Z.size() == 1) {
            return true;
        }
        return false;
    }
}
