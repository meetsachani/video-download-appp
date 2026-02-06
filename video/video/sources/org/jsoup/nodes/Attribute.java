package org.jsoup.nodes;

import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import o.JT;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.QuietAppendable;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Range;

/* loaded from: classes4.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {
    public static final String[] Y0 = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", JT.d, "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern Z0 = Pattern.compile("[^-a-zA-Z0-9_:.]+");
    public static final Pattern a1 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public String X;
    public String Y;
    public Attributes Z;

    public Attribute(String str, String str2) {
        this(str, str2, null);
    }

    public static Attribute c(String str, String str2) {
        return new Attribute(str, Entities.w(str2, true), null);
    }

    public static String e(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml && !r(str)) {
            String replaceAll = Z0.matcher(str).replaceAll(CrashlyticsReportPersistence.m);
            if (!r(replaceAll)) {
                return null;
            }
            return replaceAll;
        } else if (syntax == Document.OutputSettings.Syntax.html && !q(str)) {
            String replaceAll2 = a1.matcher(str).replaceAll(CrashlyticsReportPersistence.m);
            if (!q(replaceAll2)) {
                return null;
            }
            return replaceAll2;
        } else {
            return str;
        }
    }

    @Deprecated
    public static void j(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        k(str, str2, QuietAppendable.d(appendable), outputSettings);
    }

    public static void k(String str, String str2, QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        String e = e(str, outputSettings.p());
        if (e == null) {
            return;
        }
        m(e, str2, quietAppendable, outputSettings);
    }

    public static void m(String str, String str2, QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        quietAppendable.b(str);
        if (!x(str, str2, outputSettings)) {
            quietAppendable.b("=\"");
            Entities.n(quietAppendable, Attributes.p(str2), outputSettings, 2);
            quietAppendable.a('\"');
        }
    }

    public static boolean n(String str) {
        if (Arrays.binarySearch(Y0, Normalizer.a(str)) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean p(String str) {
        if (str.startsWith(Attributes.Z0) && str.length() > 5) {
            return true;
        }
        return false;
    }

    public static boolean q(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || ((charAt >= 127 && charAt <= 159) || charAt == ' ' || charAt == '\"' || charAt == '\'' || charAt == '/' || charAt == '=')) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_' && charAt != ':')) {
            return false;
        }
        for (int i = 1; i < length; i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < '0' || charAt2 > '9') && charAt2 != '-' && charAt2 != '_' && charAt2 != ':' && charAt2 != '.'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(String str, String str2, Document.OutputSettings outputSettings) {
        if (outputSettings.p() == Document.OutputSettings.Syntax.html) {
            if (str2 != null) {
                if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && n(str)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    /* renamed from: d */
    public String getKey() {
        return this.X;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Attribute attribute = (Attribute) obj;
            if (Objects.equals(this.X, attribute.X) && Objects.equals(this.Y, attribute.Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    /* renamed from: f */
    public String getValue() {
        return Attributes.p(this.Y);
    }

    public boolean g() {
        if (this.Y != null) {
            return true;
        }
        return false;
    }

    public String h() {
        StringBuilder e = StringUtil.e();
        l(QuietAppendable.d(e), new Document.OutputSettings());
        return StringUtil.x(e);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return Objects.hash(this.X, this.Y);
    }

    @Deprecated
    public void i(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        j(this.X, this.Y, appendable, outputSettings);
    }

    public void l(QuietAppendable quietAppendable, Document.OutputSettings outputSettings) {
        k(this.X, this.Y, quietAppendable, outputSettings);
    }

    public boolean o() {
        return p(this.X);
    }

    public String s() {
        int indexOf = this.X.indexOf(58);
        if (indexOf == -1) {
            return this.X;
        }
        return this.X.substring(indexOf + 1);
    }

    public String t() {
        Attributes attributes = this.Z;
        if (attributes != null) {
            String str = (String) attributes.t0(SharedConstants.e + u());
            if (str != null) {
                return str;
            }
            return "";
        }
        return "";
    }

    public String toString() {
        return h();
    }

    public String u() {
        int indexOf = this.X.indexOf(58);
        if (indexOf == -1) {
            return "";
        }
        return this.X.substring(0, indexOf);
    }

    public void v(String str) {
        int X;
        Validate.q(str);
        String trim = str.trim();
        Validate.n(trim);
        Attributes attributes = this.Z;
        if (attributes != null && (X = attributes.X(this.X)) != -1) {
            Attributes attributes2 = this.Z;
            String[] strArr = attributes2.Y;
            String str2 = strArr[X];
            strArr[X] = trim;
            Map<String, Range.AttributeRange> H = attributes2.H();
            if (H != null) {
                H.put(trim, H.remove(str2));
            }
        }
        this.X = trim;
    }

    @Override // java.util.Map.Entry
    /* renamed from: w */
    public String setValue(String str) {
        int X;
        String str2 = this.Y;
        Attributes attributes = this.Z;
        if (attributes != null && (X = attributes.X(this.X)) != -1) {
            str2 = this.Z.F(this.X);
            this.Z.Z[X] = str;
        }
        this.Y = str;
        return Attributes.p(str2);
    }

    @Deprecated
    public final boolean y(Document.OutputSettings outputSettings) {
        return x(this.X, this.Y, outputSettings);
    }

    public Range.AttributeRange z() {
        Attributes attributes = this.Z;
        if (attributes == null) {
            return Range.AttributeRange.c;
        }
        return attributes.s0(this.X);
    }

    public Attribute(String str, String str2, Attributes attributes) {
        Validate.q(str);
        String trim = str.trim();
        Validate.n(trim);
        this.X = trim;
        this.Y = str2;
        this.Z = attributes;
    }
}
