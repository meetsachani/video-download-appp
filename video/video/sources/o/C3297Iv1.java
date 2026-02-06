package o;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.BlockingQueue;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;

/* renamed from: o.Iv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3297Iv1 {
    public static /* synthetic */ boolean a(Field field) {
        if (!field.isAnnotationPresent(InterfaceC10953yR.class) && !field.isAnnotationPresent(InterfaceC9978uR.class) && !field.isAnnotationPresent(InterfaceC9000qR.class) && !field.isAnnotationPresent(HR.class)) {
            return false;
        }
        return true;
    }

    public static Pattern b(String str, int i, Class<?> cls, Locale locale) throws C8027mR {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if (C4500Ve2.N0(str)) {
            try {
                return Pattern.compile(str, i);
            } catch (PatternSyntaxException e) {
                C8027mR c8027mR = new C8027mR(cls, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("invalid.regex"), str));
                c8027mR.initCause(e);
                throw c8027mR;
            }
        }
        return null;
    }

    public static Pattern c(String str, int i, Class<?> cls, Locale locale) throws C8027mR {
        Pattern b = b(str, i, cls, locale);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        if (b != null && b.matcher("").groupCount() < 1) {
            throw new C8027mR(cls, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("regex.without.capture.group"), str));
        }
        return b;
    }

    public static <T> InterfaceC7449k81<T> d(Class<? extends T> cls, Locale locale, String str) {
        InterfaceC7449k81<T> sg0;
        if (Stream.of((Object[]) C2474Ao0.a(cls)).anyMatch(new Predicate() { // from class: o.Hv1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C3297Iv1.a((Field) obj);
            }
        })) {
            sg0 = new C11152zG<>();
        } else {
            sg0 = new SG0<>();
        }
        sg0.d(locale);
        sg0.setProfile(str);
        sg0.e(cls);
        return sg0;
    }

    public static synchronized void e(NR nr, long j, OR or, BlockingQueue<C10344vw1<NR>> blockingQueue) {
        List<NR> singletonList;
        synchronized (C3297Iv1.class) {
            try {
                nr.d(j);
                if (nr instanceof CR) {
                    singletonList = Collections.unmodifiableList(((CR) nr).h());
                } else {
                    singletonList = Collections.singletonList(nr);
                }
                for (NR nr2 : singletonList) {
                    try {
                        NR a = or.a(nr2);
                        if (a != null) {
                            f(blockingQueue, new C10344vw1(j, a));
                        }
                    } catch (NR e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <E> void f(BlockingQueue<E> blockingQueue, E e) {
        boolean z = true;
        while (z) {
            try {
                blockingQueue.put(e);
                z = false;
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void g(String str, Class<?> cls, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        try {
            if (C4500Ve2.N0(str)) {
                String.format(str, C4500Ve2.b);
            }
        } catch (IllegalFormatException e) {
            C8027mR c8027mR = new C8027mR(cls, String.format(ResourceBundle.getBundle(UI0.k, locale).getString("invalid.one.parameter.format.string"), str));
            c8027mR.initCause(e);
            throw c8027mR;
        }
    }
}
