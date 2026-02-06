package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nOnDemandAllocatingPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPoolKt\n*L\n1#1,103:1\n37#1:104\n37#1:105\n28#1,10:106\n37#1:126\n1557#2:116\n1628#2,2:117\n1630#2:121\n1557#2:122\n1628#2,3:123\n97#3,2:119\n*S KotlinDebug\n*F\n+ 1 OnDemandAllocatingPool.kt\nkotlinx/coroutines/internal/OnDemandAllocatingPool\n*L\n31#1:104\n50#1:105\n72#1:106,10\n88#1:126\n73#1:116\n73#1:117,2\n73#1:121\n87#1:122\n87#1:123,3\n75#1:119,2\n*E\n"})
/* renamed from: o.Qu1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4074Qu1<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(C4074Qu1.class, "controlState$volatile");
    public final int a;
    @NotNull
    public final HA0<Integer, T> b;
    public final /* synthetic */ AtomicReferenceArray c;
    private volatile /* synthetic */ int controlState$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C4074Qu1(int i, @NotNull HA0<? super Integer, ? extends T> ha0) {
        this.a = i;
        this.b = ha0;
        this.c = new AtomicReferenceArray(i);
    }

    public final boolean a() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.a) {
                return true;
            }
        } while (!d.compareAndSet(this, i, i + 1));
        e().set(i, this.b.invoke(Integer.valueOf(i)));
        return true;
    }

    @NotNull
    public final List<T> b() {
        int i;
        Object andSet;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        while (true) {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            } else if (d.compareAndSet(this, i, Integer.MIN_VALUE | i)) {
                break;
            }
        }
        C11197zR0 W1 = C5075aO1.W1(0, i);
        ArrayList arrayList = new ArrayList(C8466oF.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC8515oR0) it).nextInt();
            do {
                andSet = e().getAndSet(nextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final /* synthetic */ int c() {
        return this.controlState$volatile;
    }

    public final /* synthetic */ AtomicReferenceArray e() {
        return this.c;
    }

    public final boolean f(int i) {
        if ((i & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void g(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void h(int i) {
        this.controlState$volatile = i;
    }

    @NotNull
    public final String i() {
        String str;
        int i = d.get(this);
        C11197zR0 W1 = C5075aO1.W1(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(C8466oF.b0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(e().get(((AbstractC8515oR0) it).nextInt()));
        }
        String obj = arrayList.toString();
        if ((i & Integer.MIN_VALUE) != 0) {
            str = "[closed]";
        } else {
            str = "";
        }
        return obj + str;
    }

    public final int j() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!d.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    @NotNull
    public String toString() {
        return "OnDemandAllocatingPool(" + i() + ')';
    }
}
