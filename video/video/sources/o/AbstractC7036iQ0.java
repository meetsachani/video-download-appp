package o;

import java.util.List;

/* renamed from: o.iQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7036iQ0 {
    public static final String a = AbstractC6949i41.f("InputMerger");

    public static AbstractC7036iQ0 a(String className) {
        try {
            return (AbstractC7036iQ0) Class.forName(className).newInstance();
        } catch (Exception e) {
            AbstractC6949i41 c = AbstractC6949i41.c();
            String str = a;
            c.b(str, "Trouble instantiating + " + className, e);
            return null;
        }
    }

    public abstract androidx.work.b b(List<androidx.work.b> inputs);
}
