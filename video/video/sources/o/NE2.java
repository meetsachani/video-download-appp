package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class NE2 extends CT1 {
    public static boolean c = false;
    public static final int d = 20;
    public final WeakReference<Context> b;

    public NE2(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public static boolean b() {
        return c;
    }

    public static void c(boolean z) {
        c = z;
    }

    public static boolean d() {
        b();
        return false;
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i) throws Resources.NotFoundException {
        return super.getAnimation(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i) throws Resources.NotFoundException {
        return super.getBoolean(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i) throws Resources.NotFoundException {
        return super.getColor(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i) throws Resources.NotFoundException {
        return super.getColorStateList(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i) throws Resources.NotFoundException {
        return super.getDimension(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i, theme);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i, i2);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i, int i2, int i3) {
        return super.getFraction(i, i2, i3);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i) throws Resources.NotFoundException {
        return super.getIntArray(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i) throws Resources.NotFoundException {
        return super.getInteger(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i) throws Resources.NotFoundException {
        return super.getLayout(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i) throws Resources.NotFoundException {
        return super.getMovie(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i, int i2) throws Resources.NotFoundException {
        return super.getQuantityText(i, i2);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i) throws Resources.NotFoundException {
        return super.getResourceEntryName(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i) throws Resources.NotFoundException {
        return super.getResourceName(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i) throws Resources.NotFoundException {
        return super.getResourcePackageName(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i) throws Resources.NotFoundException {
        return super.getResourceTypeName(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i) throws Resources.NotFoundException {
        return super.getString(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i) throws Resources.NotFoundException {
        return super.getStringArray(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i) throws Resources.NotFoundException {
        return super.getText(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        return super.getTextArray(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(i, typedValue, z);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i) throws Resources.NotFoundException {
        return super.getXml(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i) throws Resources.NotFoundException {
        return super.obtainTypedArray(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i) throws Resources.NotFoundException {
        return super.openRawResource(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i) throws Resources.NotFoundException {
        return super.openRawResourceFd(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // o.CT1, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.b.get();
        if (context != null) {
            return C9010qT1.h().t(context, this, i);
        }
        return a(i);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return super.getDrawableForDensity(i, i2, theme);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i, int i2, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i, i2, objArr);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i, objArr);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i, CharSequence charSequence) {
        return super.getText(i, charSequence);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z);
    }

    @Override // o.CT1, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i, typedValue);
    }
}
