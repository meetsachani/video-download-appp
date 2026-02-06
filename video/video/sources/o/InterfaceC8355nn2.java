package o;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;

/* renamed from: o.nn2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8355nn2 extends SpinnerAdapter {

    /* renamed from: o.nn2$a */
    /* loaded from: classes.dex */
    public static final class a {
        public final Context a;
        public final LayoutInflater b;
        public LayoutInflater c;

        public a(Context context) {
            this.a = context;
            this.b = LayoutInflater.from(context);
        }

        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.c;
            if (layoutInflater != null) {
                return layoutInflater;
            }
            return this.b;
        }

        public Resources.Theme b() {
            LayoutInflater layoutInflater = this.c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void c(Resources.Theme theme) {
            if (theme == null) {
                this.c = null;
            } else if (theme.equals(this.a.getTheme())) {
                this.c = this.b;
            } else {
                this.c = LayoutInflater.from(new BM(this.a, theme));
            }
        }
    }

    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
