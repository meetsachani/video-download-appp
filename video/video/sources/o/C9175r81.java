package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* renamed from: o.r81  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9175r81 extends C8926q81 {
    /* JADX WARN: Multi-variable type inference failed */
    @XP0
    @InterfaceC9150r20(message = "Use maxByOrNull instead.", replaceWith = @IR1(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> L0(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        Object obj;
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object obj2 = (Object) it.next();
            if (!it.hasNext()) {
                obj = obj2;
            } else {
                R invoke = ha0.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) < 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            }
        }
        return (Map.Entry) obj;
    }

    @XP0
    @InterfaceC9150r20(message = "Use maxWithOrNull instead.", replaceWith = @IR1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V> Map.Entry<K, V> M0(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.Y3(map.entrySet(), comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9150r20(message = "Use minByOrNull instead.", replaceWith = @IR1(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> N0(Map<? extends K, ? extends V> map, HA0<? super Map.Entry<? extends K, ? extends V>, ? extends R> ha0) {
        Object obj;
        C6562gT0.p(map, "<this>");
        C6562gT0.p(ha0, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object obj2 = (Object) it.next();
            if (!it.hasNext()) {
                obj = obj2;
            } else {
                R invoke = ha0.invoke(obj2);
                Object obj3 = obj2;
                do {
                    Object obj4 = (Object) it.next();
                    R invoke2 = ha0.invoke(obj4);
                    obj2 = obj3;
                    if (invoke.compareTo(invoke2) > 0) {
                        invoke = invoke2;
                        obj2 = (Object) obj4;
                    }
                    obj3 = obj2;
                } while (it.hasNext());
                obj = obj2;
            }
        }
        return (Map.Entry) obj;
    }

    @InterfaceC9150r20(message = "Use minWithOrNull instead.", replaceWith = @IR1(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC9636t20(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Map.Entry O0(Map map, Comparator comparator) {
        C6562gT0.p(map, "<this>");
        C6562gT0.p(comparator, "comparator");
        return (Map.Entry) C10662xF.q4(map.entrySet(), comparator);
    }
}
