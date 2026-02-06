package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.b;
import o.C3220Ic;
import o.OL1;
import o.U4;

/* loaded from: classes.dex */
public class f extends U4 {
    public static final int k = 4;
    public static final String l = "share_history.xml";
    public int e;
    public final c f;
    public final Context g;
    public String h;
    public a i;
    public b.f j;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(f fVar, Intent intent);
    }

    /* loaded from: classes.dex */
    public class b implements b.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.b.f
        public boolean a(androidx.appcompat.widget.b bVar, Intent intent) {
            f fVar = f.this;
            a aVar = fVar.i;
            if (aVar != null) {
                aVar.a(fVar, intent);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = f.this;
            Intent b = androidx.appcompat.widget.b.d(fVar.g, fVar.h).b(menuItem.getItemId());
            if (b != null) {
                String action = b.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    f.this.r(b);
                }
                f.this.g.startActivity(b);
                return true;
            }
            return true;
        }
    }

    public f(Context context) {
        super(context);
        this.e = 4;
        this.f = new c();
        this.h = l;
        this.g = context;
    }

    @Override // o.U4
    public boolean b() {
        return true;
    }

    @Override // o.U4
    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.b.d(this.g, this.h));
        }
        TypedValue typedValue = new TypedValue();
        this.g.getTheme().resolveAttribute(OL1.b.A, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C3220Ic.b(this.g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(OL1.k.z);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(OL1.k.y);
        return activityChooserView;
    }

    @Override // o.U4
    public void g(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.b d = androidx.appcompat.widget.b.d(this.g, this.h);
        PackageManager packageManager = this.g.getPackageManager();
        int f = d.f();
        int min = Math.min(f, this.e);
        for (int i = 0; i < min; i++) {
            ResolveInfo e = d.e(i);
            subMenu.add(0, i, i, e.loadLabel(packageManager)).setIcon(e.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
        }
        if (min < f) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.g.getString(OL1.k.e));
            for (int i2 = 0; i2 < f; i2++) {
                ResolveInfo e2 = d.e(i2);
                addSubMenu.add(0, i2, i2, e2.loadLabel(packageManager)).setIcon(e2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f);
            }
        }
    }

    public final void n() {
        if (this.i == null) {
            return;
        }
        if (this.j == null) {
            this.j = new b();
        }
        androidx.appcompat.widget.b.d(this.g, this.h).u(this.j);
    }

    public void o(a aVar) {
        this.i = aVar;
        n();
    }

    public void p(String str) {
        this.h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        androidx.appcompat.widget.b.d(this.g, this.h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
