package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o.C7234jF1;

/* renamed from: o.Zm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4930Zm2 {
    public static final int a = 0;
    public static final int b = 1;

    /* renamed from: o.Zm2$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        public static void e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: o.Zm2$b */
    /* loaded from: classes.dex */
    public static class b {
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: o.Zm2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        public static void f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        public static void g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        public static void h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: o.Zm2$e */
    /* loaded from: classes.dex */
    public static class e {
        public static void a(TextView textView, int i, float f) {
            textView.setLineHeight(i, f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Zm2$f */
    /* loaded from: classes.dex */
    public @interface f {
    }

    /* renamed from: o.Zm2$g */
    /* loaded from: classes.dex */
    public static class g implements ActionMode.Callback {
        public static final int g = 100;
        public final ActionMode.Callback a;
        public final TextView b;
        public Class<?> c;
        public Method d;
        public boolean e;
        public boolean f = false;

        public g(ActionMode.Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        public ActionMode.Callback d() {
            return this.a;
        }

        public final boolean e(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        public final boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        public final void g(Menu menu) {
            Method declaredMethod;
            Context context = this.b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z = this.f;
            Class cls = Integer.TYPE;
            if (!z) {
                this.f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = cls2;
                    this.d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                if (this.e && this.c.isInstance(menu)) {
                    declaredMethod = this.d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", cls);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> c = c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static void A(TextView textView, int i) {
        C10907yF1.i(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void B(TextView textView, int i, float f2) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i, f2);
        } else {
            A(textView, Math.round(TypedValue.applyDimension(i, f2, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void C(TextView textView, C7234jF1 c7234jF1) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(d.a(c7234jF1.f()));
        } else if (o(textView).a(c7234jF1.e())) {
            textView.setText(c7234jF1);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void D(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    public static void E(TextView textView, C7234jF1.b bVar) {
        textView.setTextDirection(m(bVar.d()));
        textView.getPaint().set(bVar.e());
        a.e(textView, bVar.b());
        a.h(textView, bVar.c());
    }

    public static ActionMode.Callback F(ActionMode.Callback callback) {
        if ((callback instanceof g) && Build.VERSION.SDK_INT >= 26) {
            return ((g) callback).d();
        }
        return callback;
    }

    public static ActionMode.Callback G(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof g) && callback != null) {
            return new g(callback, textView);
        }
        return callback;
    }

    public static int a(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.a(textView);
        }
        if (textView instanceof InterfaceC6117ei) {
            return ((InterfaceC6117ei) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int b(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.b(textView);
        }
        if (textView instanceof InterfaceC6117ei) {
            return ((InterfaceC6117ei) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int c(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.c(textView);
        }
        if (textView instanceof InterfaceC6117ei) {
            return ((InterfaceC6117ei) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    public static int[] d(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.d(textView);
        }
        if (textView instanceof InterfaceC6117ei) {
            return ((InterfaceC6117ei) textView).getAutoSizeTextAvailableSizes();
        }
        return new int[0];
    }

    public static int e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.e(textView);
        }
        if (textView instanceof InterfaceC6117ei) {
            return ((InterfaceC6117ei) textView).getAutoSizeTextType();
        }
        return 0;
    }

    public static ColorStateList f(TextView textView) {
        C10907yF1.l(textView);
        return a.b(textView);
    }

    public static PorterDuff.Mode g(TextView textView) {
        C10907yF1.l(textView);
        return a.c(textView);
    }

    @JR1(expression = "textView.getCompoundDrawablesRelative()")
    @Deprecated
    public static Drawable[] h(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    @JR1(expression = "textView.getMaxLines()")
    @Deprecated
    public static int k(TextView textView) {
        return textView.getMaxLines();
    }

    @JR1(expression = "textView.getMinLines()")
    @Deprecated
    public static int l(TextView textView) {
        return textView.getMinLines();
    }

    public static int m(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic != textDirectionHeuristic3) {
            return 1;
        }
        return 7;
    }

    public static TextDirectionHeuristic n(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static C7234jF1.b o(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C7234jF1.b(d.c(textView));
        }
        C7234jF1.b.a aVar = new C7234jF1.b.a(new TextPaint(textView.getPaint()));
        aVar.b(a.a(textView));
        aVar.c(a.d(textView));
        aVar.d(n(textView));
        return aVar.a();
    }

    public static void p(TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.f(textView, i, i2, i3, i4);
        } else if (textView instanceof InterfaceC6117ei) {
            ((InterfaceC6117ei) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    public static void q(TextView textView, int[] iArr, int i) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.g(textView, iArr, i);
        } else if (textView instanceof InterfaceC6117ei) {
            ((InterfaceC6117ei) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }
    }

    public static void r(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            c.h(textView, i);
        } else if (textView instanceof InterfaceC6117ei) {
            ((InterfaceC6117ei) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public static void s(TextView textView, ColorStateList colorStateList) {
        C10907yF1.l(textView);
        a.f(textView, colorStateList);
    }

    public static void t(TextView textView, PorterDuff.Mode mode) {
        C10907yF1.l(textView);
        a.g(textView, mode);
    }

    @JR1(expression = "textView.setCompoundDrawablesRelative(start, top, end, bottom)")
    @Deprecated
    public static void u(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @JR1(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void v(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @JR1(expression = "textView.setCompoundDrawablesRelativeWithIntrinsicBounds(start, top, end, bottom)")
    @Deprecated
    public static void w(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @JR1(expression = "textView.setCustomSelectionActionModeCallback(callback)")
    @Deprecated
    public static void x(TextView textView, ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }

    public static void y(TextView textView, int i) {
        int i2;
        C10907yF1.i(i);
        if (Build.VERSION.SDK_INT >= 28) {
            d.d(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(TextView textView, int i) {
        int i2;
        C10907yF1.i(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: o.Zm2$d */
    /* loaded from: classes.dex */
    public static class d {
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        public static void d(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }

        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
