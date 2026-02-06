package o;

import java.util.List;

/* renamed from: o.Vo1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4539Vo1 {
    public final List<AbstractC4636Wo1> a;
    public final int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4539Vo1(AbstractC4636Wo1 abstractC4636Wo1) {
        this(abstractC4636Wo1, null, null, 6, null);
        C6562gT0.p(abstractC4636Wo1, "currentInfo");
    }

    public final int a() {
        return this.b;
    }

    public final List<AbstractC4636Wo1> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4539Vo1.class != obj.getClass()) {
            return false;
        }
        C4539Vo1 c4539Vo1 = (C4539Vo1) obj;
        if (this.b == c4539Vo1.b && C6562gT0.g(this.a, c4539Vo1.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.b * 31) + this.a.hashCode();
    }

    public String toString() {
        return "NavigationEventHistory(currentIndex=" + this.b + ", mergedHistory=" + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4539Vo1(AbstractC4636Wo1 abstractC4636Wo1, List<? extends AbstractC4636Wo1> list) {
        this(abstractC4636Wo1, list, null, 4, null);
        C6562gT0.p(abstractC4636Wo1, "currentInfo");
        C6562gT0.p(list, "backInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4539Vo1(List<? extends AbstractC4636Wo1> list, int i) {
        this.a = list;
        this.b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + C8222nF.I(list) + "'.").toString());
    }

    public C4539Vo1() {
        this(C8222nF.H(), -1);
    }

    public /* synthetic */ C4539Vo1(AbstractC4636Wo1 abstractC4636Wo1, List list, List list2, int i, C9516sY c9516sY) {
        this(abstractC4636Wo1, (i & 2) != 0 ? C8222nF.H() : list, (i & 4) != 0 ? C8222nF.H() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4539Vo1(AbstractC4636Wo1 abstractC4636Wo1, List<? extends AbstractC4636Wo1> list, List<? extends AbstractC4636Wo1> list2) {
        this(C7979mF.a(r0), list.size());
        C6562gT0.p(abstractC4636Wo1, "currentInfo");
        C6562gT0.p(list, "backInfo");
        C6562gT0.p(list2, "forwardInfo");
        List i = C7979mF.i();
        List list3 = i;
        C9444sF.q0(list3, list);
        list3.add(abstractC4636Wo1);
        C9444sF.q0(list3, list2);
    }
}
