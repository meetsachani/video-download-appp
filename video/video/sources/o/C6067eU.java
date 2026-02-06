package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Deprecated
/* renamed from: o.eU  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6067eU implements InterfaceC4651Ws0<C6067eU> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    @InterfaceC11300zs1
    public final AD2 i;
    @InterfaceC11300zs1
    public final I12 j;
    @InterfaceC11300zs1
    public final Uri k;
    @InterfaceC11300zs1
    public final C5540cJ1 l;
    public final List<CC1> m;

    public C6067eU(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @InterfaceC11300zs1 C5540cJ1 c5540cJ1, @InterfaceC11300zs1 AD2 ad2, @InterfaceC11300zs1 I12 i12, @InterfaceC11300zs1 Uri uri, List<CC1> list) {
        List<CC1> list2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = c5540cJ1;
        this.i = ad2;
        this.k = uri;
        this.j = i12;
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            list2 = list;
        }
        this.m = list2;
    }

    public static ArrayList<C8190n7> c(List<C8190n7> list, LinkedList<C3031Gd2> linkedList) {
        C3031Gd2 poll = linkedList.poll();
        int i = poll.X;
        ArrayList<C8190n7> arrayList = new ArrayList<>();
        do {
            int i2 = poll.Y;
            C8190n7 c8190n7 = list.get(i2);
            List<ZR1> list2 = c8190n7.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.Z));
                poll = linkedList.poll();
                if (poll.X != i) {
                    break;
                }
            } while (poll.Y == i2);
            arrayList.add(new C8190n7(c8190n7.a, c8190n7.b, arrayList2, c8190n7.d, c8190n7.e, c8190n7.f));
        } while (poll.X == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    @Override // o.InterfaceC4651Ws0
    /* renamed from: b */
    public final C6067eU a(List<C3031Gd2> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C3031Gd2(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int e = e();
            j = C10323vs.b;
            if (i >= e) {
                break;
            }
            if (((C3031Gd2) linkedList.peek()).X != i) {
                long f = f(i);
                if (f != C10323vs.b) {
                    j2 += f;
                }
            } else {
                CC1 d = d(i);
                arrayList.add(new CC1(d.a, d.b - j2, c(d.c, linkedList), d.d));
            }
            i++;
        }
        long j3 = this.b;
        if (j3 != C10323vs.b) {
            j = j3 - j2;
        }
        return new C6067eU(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final CC1 d(int i) {
        return this.m.get(i);
    }

    public final int e() {
        return this.m.size();
    }

    public final long f(int i) {
        long j;
        long j2;
        if (i == this.m.size() - 1) {
            j = this.b;
            if (j == C10323vs.b) {
                return C10323vs.b;
            }
            j2 = this.m.get(i).b;
        } else {
            j = this.m.get(i + 1).b;
            j2 = this.m.get(i).b;
        }
        return j - j2;
    }

    public final long g(int i) {
        return TD2.j1(f(i));
    }
}
