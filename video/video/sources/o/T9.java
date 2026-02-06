package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import o.InterfaceC8441o9;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class T9 extends LE2 implements InterfaceC8441o9 {
    public static final String d1 = "AnimatedVDCompat";
    public static final String e1 = "animated-vector";
    public static final String f1 = "target";
    public static final boolean g1 = false;
    public c Y;
    public ArgbEvaluator Y0;
    public Context Z;
    public d Z0;
    public Animator.AnimatorListener a1;
    public ArrayList<InterfaceC8441o9.a> b1;
    public final Drawable.Callback c1;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            T9.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            T9.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            T9.this.unscheduleSelf(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(T9.this.b1);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC8441o9.a) arrayList.get(i)).b(T9.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(T9.this.b1);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC8441o9.a) arrayList.get(i)).c(T9.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public int a;
        public ME2 b;
        public AnimatorSet c;
        public ArrayList<Animator> d;
        public C2531Be<Animator, String> e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.a = cVar.a;
                ME2 me2 = cVar.b;
                if (me2 != null) {
                    Drawable.ConstantState constantState = me2.getConstantState();
                    if (resources != null) {
                        this.b = (ME2) constantState.newDrawable(resources);
                    } else {
                        this.b = (ME2) constantState.newDrawable();
                    }
                    ME2 me22 = (ME2) this.b.mutate();
                    this.b = me22;
                    me22.setCallback(callback);
                    this.b.setBounds(cVar.b.getBounds());
                    this.b.l(false);
                }
                ArrayList<Animator> arrayList = cVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new C2531Be<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.e.get(animator);
                        clone.setTarget(this.b.g(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public T9() {
        this(null, null, null);
    }

    public static void a(Drawable drawable) {
        if (!(drawable instanceof Animatable)) {
            return;
        }
        ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
    }

    public static T9 d(Context context, int i) {
        T9 t9 = new T9(context);
        Drawable g = C10231vT1.g(context.getResources(), i, context.getTheme());
        t9.X = g;
        g.setCallback(t9.c1);
        t9.Z0 = new d(t9.X.getConstantState());
        return t9;
    }

    public static T9 e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        T9 t9 = new T9(context);
        t9.inflate(resources, xmlPullParser, attributeSet, theme);
        return t9;
    }

    public static void f(Drawable drawable, InterfaceC8441o9.a aVar) {
        if (drawable != null && aVar != null && (drawable instanceof Animatable)) {
            g((AnimatedVectorDrawable) drawable, aVar);
        }
    }

    public static void g(AnimatedVectorDrawable animatedVectorDrawable, InterfaceC8441o9.a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.a());
    }

    public static boolean k(Drawable drawable, InterfaceC8441o9.a aVar) {
        if (drawable == null || aVar == null || !(drawable instanceof Animatable)) {
            return false;
        }
        return l((AnimatedVectorDrawable) drawable, aVar);
    }

    public static boolean l(AnimatedVectorDrawable animatedVectorDrawable, InterfaceC8441o9.a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.a());
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.a(drawable, theme);
        }
    }

    @Override // o.InterfaceC8441o9
    public boolean b(InterfaceC8441o9.a aVar) {
        Drawable drawable = this.X;
        if (drawable != null) {
            l((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<InterfaceC8441o9.a> arrayList = this.b1;
        if (arrayList != null && aVar != null) {
            boolean remove = arrayList.remove(aVar);
            if (this.b1.size() == 0) {
                h();
            }
            return remove;
        }
        return false;
    }

    @Override // o.InterfaceC8441o9
    public void c(InterfaceC8441o9.a aVar) {
        Drawable drawable = this.X;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.b1 == null) {
                this.b1 = new ArrayList<>();
            }
            if (this.b1.contains(aVar)) {
                return;
            }
            this.b1.add(aVar);
            if (this.a1 == null) {
                this.a1 = new b();
            }
            this.Y.c.addListener(this.a1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.b(drawable);
        }
        return false;
    }

    @Override // o.InterfaceC8441o9
    public void clearAnimationCallbacks() {
        Drawable drawable = this.X;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        h();
        ArrayList<InterfaceC8441o9.a> arrayList = this.b1;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.Y.b.draw(canvas);
        if (this.Y.c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.d(drawable);
        }
        return this.Y.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.Y.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.e(drawable);
        }
        return this.Y.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.X != null) {
            return new d(this.X.getConstantState());
        }
        return null;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.Y.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.Y.b.getIntrinsicWidth();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.Y.b.getOpacity();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final void h() {
        Animator.AnimatorListener animatorListener = this.a1;
        if (animatorListener != null) {
            this.Y.c.removeListener(animatorListener);
            this.a1 = null;
        }
    }

    public final void i(String str, Animator animator) {
        animator.setTarget(this.Y.b.g(str));
        c cVar = this.Y;
        if (cVar.d == null) {
            cVar.d = new ArrayList<>();
            this.Y.e = new C2531Be<>();
        }
        this.Y.d.add(animator);
        this.Y.e.put(animator, str);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (e1.equals(name)) {
                    TypedArray s = C5206aw2.s(resources, theme, attributeSet, C6481g9.M);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        ME2 d2 = ME2.d(resources, resourceId, theme);
                        d2.l(false);
                        d2.setCallback(this.c1);
                        ME2 me2 = this.Y.b;
                        if (me2 != null) {
                            me2.setCallback(null);
                        }
                        this.Y.b = d2;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C6481g9.O);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.Z;
                        if (context != null) {
                            i(string, C6328fa.j(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.Y.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return D60.h(drawable);
        }
        return this.Y.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.Y.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.Y.b.isStateful();
    }

    public final void j(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                j(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.Y0 == null) {
                    this.Y0 = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.Y0);
            }
        }
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.Y.b.setBounds(rect);
        }
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.Y.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.Y.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.Y.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.j(drawable, z);
        } else {
            this.Y.b.setAutoMirrored(z);
        }
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.LE2, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(int i) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.n(drawable, i);
        } else {
            this.Y.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.o(drawable, colorStateList);
        } else {
            this.Y.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.X;
        if (drawable != null) {
            D60.p(drawable, mode);
        } else {
            this.Y.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.X;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.Y.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.X;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.Y.c.isStarted()) {
        } else {
            this.Y.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.X;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.Y.c.end();
        }
    }

    public T9(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.X;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.Y.b.setColorFilter(colorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            T9 t9 = new T9();
            Drawable newDrawable = this.a.newDrawable();
            t9.X = newDrawable;
            newDrawable.setCallback(t9.c1);
            return t9;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            T9 t9 = new T9();
            Drawable newDrawable = this.a.newDrawable(resources);
            t9.X = newDrawable;
            newDrawable.setCallback(t9.c1);
            return t9;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            T9 t9 = new T9();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            t9.X = newDrawable;
            newDrawable.setCallback(t9.c1);
            return t9;
        }
    }

    public T9(Context context, c cVar, Resources resources) {
        this.Y0 = null;
        this.a1 = null;
        this.b1 = null;
        a aVar = new a();
        this.c1 = aVar;
        this.Z = context;
        if (cVar != null) {
            this.Y = cVar;
        } else {
            this.Y = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
