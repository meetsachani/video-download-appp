package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: o.Bp2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2578Bp2 extends ContextWrapper {
    public static final Object c = new Object();
    public static ArrayList<WeakReference<C2578Bp2>> d;
    public final Resources a;
    public final Resources.Theme b;

    public C2578Bp2(Context context) {
        super(context);
        if (NE2.d()) {
            NE2 ne2 = new NE2(this, context.getResources());
            this.a = ne2;
            Resources.Theme newTheme = ne2.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new C2774Dp2(this, context.getResources());
        this.b = null;
    }

    public static boolean a(Context context) {
        if ((context instanceof C2578Bp2) || (context.getResources() instanceof C2774Dp2) || (context.getResources() instanceof NE2) || !NE2.d()) {
            return false;
        }
        return true;
    }

    public static Context b(Context context) {
        C2578Bp2 c2578Bp2;
        if (a(context)) {
            synchronized (c) {
                try {
                    ArrayList<WeakReference<C2578Bp2>> arrayList = d;
                    if (arrayList == null) {
                        d = new ArrayList<>();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference<C2578Bp2> weakReference = d.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                d.remove(size);
                            }
                        }
                        for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                            WeakReference<C2578Bp2> weakReference2 = d.get(size2);
                            if (weakReference2 != null) {
                                c2578Bp2 = weakReference2.get();
                            } else {
                                c2578Bp2 = null;
                            }
                            if (c2578Bp2 != null && c2578Bp2.getBaseContext() == context) {
                                return c2578Bp2;
                            }
                        }
                    }
                    C2578Bp2 c2578Bp22 = new C2578Bp2(context);
                    d.add(new WeakReference<>(c2578Bp22));
                    return c2578Bp22;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme == null) {
            return super.getTheme();
        }
        return theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
