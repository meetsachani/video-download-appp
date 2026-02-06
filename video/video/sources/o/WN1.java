package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import o.C7025iN1;

/* loaded from: classes3.dex */
public class WN1 extends AbstractC3550Ll<WN1, b, c> {
    public float y3;
    public int z3;

    /* loaded from: classes3.dex */
    public interface b extends InterfaceC11270zl<WN1> {
        @Override // o.InterfaceC11270zl
        /* renamed from: c */
        void a(@InterfaceC5670cr1 WN1 wn1, float f, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface c extends InterfaceC2461Al<WN1> {
        @Override // o.InterfaceC2461Al
        /* renamed from: d */
        void a(@InterfaceC5670cr1 WN1 wn1);

        @Override // o.InterfaceC2461Al
        /* renamed from: e */
        void b(@InterfaceC5670cr1 WN1 wn1);
    }

    /* loaded from: classes3.dex */
    public static class d extends AbsSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public float X;
        public int Y;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.X);
            parcel.writeInt(this.Y);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public d(Parcel parcel) {
            super(parcel.readParcelable(d.class.getClassLoader()));
            this.X = parcel.readFloat();
            this.Y = parcel.readInt();
        }
    }

    public WN1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static List<Float> w1(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < typedArray.length(); i++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i, -1.0f)));
        }
        return arrayList;
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void A() {
        super.A();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void O0(@InterfaceC5670cr1 b bVar) {
        super.O0(bVar);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void P0(@InterfaceC5670cr1 c cVar) {
        super.P0(cVar);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void R0() {
        super.R0();
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@InterfaceC5670cr1 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // o.AbstractC3550Ll
    public float getMinSeparation() {
        return this.y3;
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getTickVisibilityMode() {
        return super.getTickVisibilityMode();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTrackCornerSize() {
        return super.getTrackCornerSize();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconActiveColor() {
        return super.getTrackIconActiveColor();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveEnd() {
        return super.getTrackIconActiveEnd();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ Drawable getTrackIconActiveStart() {
        return super.getTrackIconActiveStart();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ ColorStateList getTrackIconInactiveColor() {
        return super.getTrackIconInactiveColor();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveEnd() {
        return super.getTrackIconInactiveEnd();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ Drawable getTrackIconInactiveStart() {
        return super.getTrackIconInactiveStart();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getTrackIconSize() {
        return super.getTrackIconSize();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // o.AbstractC3550Ll
    @PK1
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // o.AbstractC3550Ll
    @InterfaceC5670cr1
    public List<Float> getValues() {
        return super.getValues();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ boolean h0() {
        return super.h0();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ boolean l0() {
        return super.l0();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void m(@InterfaceC5670cr1 b bVar) {
        super.m(bVar);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void n(@InterfaceC5670cr1 c cVar) {
        super.n(cVar);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // o.AbstractC3550Ll, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, @InterfaceC5670cr1 KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // o.AbstractC3550Ll, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, @InterfaceC5670cr1 KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public void onRestoreInstanceState(@InterfaceC11300zs1 Parcelable parcelable) {
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.y3 = dVar.X;
        int i = dVar.Y;
        this.z3 = i;
        setSeparationUnit(i);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.X = this.y3;
        dVar.Y = this.z3;
        return dVar;
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setCentered(boolean z) {
        super.setCentered(z);
    }

    @Override // o.AbstractC3550Ll
    public void setCustomThumbDrawable(@K60 int i) {
        super.setCustomThumbDrawable(i);
    }

    @Override // o.AbstractC3550Ll
    public void setCustomThumbDrawablesForValues(@InterfaceC5670cr1 @K60 int... iArr) {
        super.setCustomThumbDrawablesForValues(iArr);
    }

    @Override // o.AbstractC3550Ll, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setHaloRadius(@BR0(from = 0) @PK1 int i) {
        super.setHaloRadius(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@InterfaceC9154r30 int i) {
        super.setHaloRadiusResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setHaloTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setLabelFormatter(@InterfaceC11300zs1 InterfaceC7064iY0 interfaceC7064iY0) {
        super.setLabelFormatter(interfaceC7064iY0);
    }

    public void setMinSeparation(@InterfaceC9397s30 float f) {
        this.y3 = f;
        this.z3 = 0;
        setSeparationUnit(0);
    }

    public void setMinSeparationValue(float f) {
        this.y3 = f;
        this.z3 = 1;
        setSeparationUnit(1);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setOrientation(int i) {
        super.setOrientation(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@InterfaceC9154r30 int i) {
        super.setThumbElevationResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbHeight(@BR0(from = 0) @PK1 int i) {
        super.setThumbHeight(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbHeightResource(@InterfaceC9154r30 int i) {
        super.setThumbHeightResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbRadius(@BR0(from = 0) @PK1 int i) {
        super.setThumbRadius(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@InterfaceC9154r30 int i) {
        super.setThumbRadiusResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@InterfaceC6509gG int i) {
        super.setThumbStrokeColorResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@InterfaceC9154r30 int i) {
        super.setThumbStrokeWidthResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(@PK1 int i) {
        super.setThumbTrackGapSize(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbWidth(@BR0(from = 0) @PK1 int i) {
        super.setThumbWidth(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setThumbWidthResource(@InterfaceC9154r30 int i) {
        super.setThumbWidthResource(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@BR0(from = 0) @PK1 int i) {
        super.setTickActiveRadius(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@BR0(from = 0) @PK1 int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTickVisibilityMode(int i) {
        super.setTickVisibilityMode(i);
    }

    @Override // o.AbstractC3550Ll
    @Deprecated
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z) {
        super.setTickVisible(z);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackCornerSize(@PK1 int i) {
        super.setTrackCornerSize(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackHeight(@BR0(from = 0) @PK1 int i) {
        super.setTrackHeight(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconActiveColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        super.setTrackIconActiveColor(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(@K60 int i) {
        super.setTrackIconActiveEnd(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(@K60 int i) {
        super.setTrackIconActiveStart(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconInactiveColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        super.setTrackIconInactiveColor(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(@K60 int i) {
        super.setTrackIconInactiveEnd(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(@K60 int i) {
        super.setTrackIconInactiveStart(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconSize(@PK1 int i) {
        super.setTrackIconSize(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(@PK1 int i) {
        super.setTrackInsideCornerSize(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(@PK1 int i) {
        super.setTrackStopIndicatorSize(i);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setValueFrom(float f) {
        super.setValueFrom(f);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setValueTo(float f) {
        super.setValueTo(f);
    }

    @Override // o.AbstractC3550Ll
    public void setValues(@InterfaceC5670cr1 Float... fArr) {
        super.setValues(fArr);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ boolean x0() {
        return super.x0();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ boolean y0() {
        return super.y0();
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void z() {
        super.z();
    }

    public WN1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.sliderStyle);
    }

    @Override // o.AbstractC3550Ll
    public void setCustomThumbDrawable(@InterfaceC5670cr1 Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // o.AbstractC3550Ll
    public void setCustomThumbDrawablesForValues(@InterfaceC5670cr1 Drawable... drawableArr) {
        super.setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(@InterfaceC11300zs1 Drawable drawable) {
        super.setTrackIconActiveEnd(drawable);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(@InterfaceC11300zs1 Drawable drawable) {
        super.setTrackIconActiveStart(drawable);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(@InterfaceC11300zs1 Drawable drawable) {
        super.setTrackIconInactiveEnd(drawable);
    }

    @Override // o.AbstractC3550Ll
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(@InterfaceC11300zs1 Drawable drawable) {
        super.setTrackIconInactiveStart(drawable);
    }

    @Override // o.AbstractC3550Ll
    public void setValues(@InterfaceC5670cr1 List<Float> list) {
        super.setValues(list);
    }

    public WN1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.H9, i, AbstractC3550Ll.j3, new int[0]);
        int i2 = C7025iN1.o.J9;
        if (k.hasValue(i2)) {
            setValues(w1(k.getResources().obtainTypedArray(k.getResourceId(i2, 0))));
        }
        this.y3 = k.getDimension(C7025iN1.o.I9, 0.0f);
        k.recycle();
    }
}
