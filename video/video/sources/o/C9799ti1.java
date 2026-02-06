package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: o.ti1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9799ti1 extends C5711d11 implements InterfaceC8821pi1 {
    public static final String P1 = "MenuPopupWindow";
    public static Method Q1;
    public InterfaceC8821pi1 O1;

    /* renamed from: o.ti1$a */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: o.ti1$b */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: o.ti1$c */
    /* loaded from: classes.dex */
    public static class c extends C10388w70 {
        public final int n1;
        public final int o1;
        public InterfaceC8821pi1 p1;
        public MenuItem q1;

        public c(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.n1 = 21;
                this.o1 = 22;
                return;
            }
            this.n1 = 22;
            this.o1 = 21;
        }

        @Override // o.C10388w70
        public /* bridge */ /* synthetic */ int d(int i, boolean z) {
            return super.d(i, z);
        }

        @Override // o.C10388w70
        public /* bridge */ /* synthetic */ int e(int i, int i2, int i3, int i4, int i5) {
            return super.e(i, i2, i3, i4, i5);
        }

        @Override // o.C10388w70
        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i) {
            return super.f(motionEvent, i);
        }

        @Override // o.C10388w70, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // o.C10388w70, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // o.C10388w70, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // o.C10388w70, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // o.C10388w70, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int i;
            androidx.appcompat.view.menu.h hVar;
            int pointToPosition;
            int i2;
            if (this.p1 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < dVar.getCount()) {
                    hVar = dVar.getItem(i2);
                } else {
                    hVar = null;
                }
                MenuItem menuItem = this.q1;
                if (menuItem != hVar) {
                    androidx.appcompat.view.menu.e b = dVar.b();
                    if (menuItem != null) {
                        this.p1.o(b, menuItem);
                    }
                    this.q1 = hVar;
                    if (hVar != null) {
                        this.p1.d(b, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            androidx.appcompat.view.menu.d dVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.n1) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.o1) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    dVar = (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                }
                dVar.b().f(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // o.C10388w70, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void p() {
            setSelection(-1);
        }

        public void setHoverListener(InterfaceC8821pi1 interfaceC8821pi1) {
            this.p1 = interfaceC8821pi1;
        }

        @Override // o.C10388w70, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Q1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(P1, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C9799ti1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // o.InterfaceC8821pi1
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC8821pi1 interfaceC8821pi1 = this.O1;
        if (interfaceC8821pi1 != null) {
            interfaceC8821pi1.d(eVar, menuItem);
        }
    }

    @Override // o.InterfaceC8821pi1
    public void o(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        InterfaceC8821pi1 interfaceC8821pi1 = this.O1;
        if (interfaceC8821pi1 != null) {
            interfaceC8821pi1.o(eVar, menuItem);
        }
    }

    public void o0(Object obj) {
        a.a(this.A1, (Transition) obj);
    }

    public void p0(Object obj) {
        a.b(this.A1, (Transition) obj);
    }

    public void q0(InterfaceC8821pi1 interfaceC8821pi1) {
        this.O1 = interfaceC8821pi1;
    }

    public void r0(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Q1;
            if (method != null) {
                try {
                    method.invoke(this.A1, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i(P1, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        b.a(this.A1, z);
    }

    @Override // o.C5711d11
    public C10388w70 t(Context context, boolean z) {
        c cVar = new c(context, z);
        cVar.setHoverListener(this);
        return cVar;
    }
}
