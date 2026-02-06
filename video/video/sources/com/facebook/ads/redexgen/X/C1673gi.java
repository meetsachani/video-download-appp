package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.ads.internal.context.Repairable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.gi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1673gi extends T8 {
    public static String[] A06 = {"4Fl94EIzOk67aYUPduHJ8UazEL", "sAhktSZOOrm35xxj8Imdq8RPkj", "oRYwVa3KjTvntAfrBK1sqTqE8vcnrhu1", "DAigVkrFkMuOUy14T2FK5zmWgvJcIn3a", "an5oIaHMQLp81wCZBnKMJTBSx7KtQFJf", "wEWpxEoKGSO43ttKCSegU3t35jPnkl3s", "WpWdxAQuBweGThqHfmbUTgqTG7", "dWX8I2VlCkDjmK6jHvJYkvPP690yaesv"};
    public WeakReference<Activity> A00;
    public WeakHashMap<Repairable, Boolean> A01;
    public final T6 A02;
    public final AtomicReference<T5> A03;
    public final AtomicReference<Object> A04;
    public final AtomicReference<InterfaceC0899Lt> A05;

    public C1673gi(Activity activity, TA ta, InterfaceC0899Lt interfaceC0899Lt) {
        super(activity.getApplicationContext(), ta);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new T6();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC0899Lt);
        this.A00 = new WeakReference<>(activity);
    }

    public C1673gi(Context context, TA ta, InterfaceC0899Lt interfaceC0899Lt) {
        super(context.getApplicationContext(), ta);
        this.A01 = new WeakHashMap<>();
        this.A05 = new AtomicReference<>();
        this.A03 = new AtomicReference<>();
        this.A02 = new T6();
        this.A04 = new AtomicReference<>();
        this.A05.set(interfaceC0899Lt);
        Activity A00 = A00(context);
        if (A00 != null) {
            this.A00 = new WeakReference<>(A00);
        } else {
            this.A00 = new WeakReference<>(null);
        }
    }

    public static Activity A00(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof C1673gi) && ((C1673gi) context).A0E() != null) {
                return ((C1673gi) context).A0E();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public final Activity A0E() {
        return this.A00.get();
    }

    public InterfaceC0899Lt A0F() {
        InterfaceC0899Lt funnel = this.A05.get();
        if (funnel == null) {
            return new C1902kX();
        }
        return funnel;
    }

    public final T5 A0G() {
        return this.A03.get();
    }

    public final T6 A0H() {
        return this.A02;
    }

    public final Object A0I() {
        return this.A04.get();
    }

    public final void A0J(Activity activity) {
        this.A00 = new WeakReference<>(activity);
    }

    public final void A0K(InterfaceC0899Lt interfaceC0899Lt) {
        this.A05.set(interfaceC0899Lt);
    }

    public final void A0L(C1673gi c1673gi) {
        c1673gi.A01.putAll(this.A01);
        this.A01 = c1673gi.A01;
    }

    public final void A0M(C1673gi c1673gi) {
        A0K(c1673gi.A0F());
        A0D(c1673gi.A0C());
        A0N(c1673gi.A0G());
    }

    public final void A0N(T5 t5) {
        this.A03.set(t5);
    }

    public final void A0O(Repairable repairable) {
        this.A01.put(repairable, true);
    }

    public final void A0P(Object obj) {
        this.A04.set(obj);
    }

    public final void A0Q(Throwable th) {
        Iterator<Map.Entry<Repairable, Boolean>> it = this.A01.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A06;
            if (strArr[4].charAt(18) == strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "cq4W2mN05Su2gaFDi5CYFjM7nJ";
            strArr2[6] = "g7MgkZWMqMCaiMVBRzNoHUUy7c";
            if (hasNext) {
                it.next().getKey().repair(th);
            } else {
                return;
            }
        }
    }
}
