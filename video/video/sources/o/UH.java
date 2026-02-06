package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class UH {
    public static final String d = "ComplexColorCompat";
    public final Shader a;
    public final ColorStateList b;
    public int c;

    public UH(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.c = i;
    }

    public static UH a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return c(C8956qG.b(resources, xml, asAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return d(C8949qE0.c(resources, xml, asAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static UH b(int i) {
        return new UH(null, null, i);
    }

    public static UH c(ColorStateList colorStateList) {
        return new UH(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static UH d(Shader shader) {
        return new UH(shader, null, 0);
    }

    public static UH g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception e) {
            Log.e(d, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        ColorStateList colorStateList;
        if (this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        if (!h() && this.c == 0) {
            return false;
        }
        return true;
    }
}
