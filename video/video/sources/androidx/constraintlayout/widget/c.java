package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.j;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import o.C5445bv2;
import o.C6566gU0;
import o.C8590ol1;
import o.YK;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {
    public static final String h = "ConstraintLayoutStates";
    public static final boolean i = false;
    public final ConstraintLayout a;
    public e b;
    public int c = -1;
    public int d = -1;
    public SparseArray<a> e = new SparseArray<>();
    public SparseArray<e> f = new SparseArray<>();
    public YK g = null;

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c;
        public e d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.xe);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.ye) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == j.c.ze) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if (C5445bv2.w.equals(resourceTypeName)) {
                        e eVar = new e();
                        this.d = eVar;
                        eVar.G(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;
        public int f;
        public e g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.rf);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.sf) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if (C5445bv2.w.equals(resourceTypeName)) {
                        e eVar = new e();
                        this.g = eVar;
                        eVar.G(context, this.f);
                    }
                } else if (index == j.c.tf) {
                    this.e = obtainStyledAttributes.getDimension(index, this.e);
                } else if (index == j.c.uf) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == j.c.vf) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == j.c.wf) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (!Float.isNaN(this.b) && f < this.b) {
                return false;
            }
            if (!Float.isNaN(this.c) && f2 < this.c) {
                return false;
            }
            if (!Float.isNaN(this.d) && f > this.d) {
                return false;
            }
            if (!Float.isNaN(this.e) && f2 > this.e) {
                return false;
            }
            return true;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i2) {
        this.a = constraintLayout;
        a(context, i2);
    }

    public final void a(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1382829617:
                                if (name.equals(C8590ol1.K)) {
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    continue;
                                } else {
                                    c(context, xml);
                                    continue;
                                }
                            } else {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            a aVar2 = new a(context, xml);
                            this.e.put(aVar2.a, aVar2);
                            aVar = aVar2;
                            continue;
                        }
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e2);
        }
    }

    public boolean b(int i2, float f, float f2) {
        a aVar;
        int i3 = this.c;
        if (i3 != i2) {
            return true;
        }
        if (i2 == -1) {
            aVar = this.e.valueAt(0);
        } else {
            aVar = this.e.get(i3);
        }
        a aVar2 = aVar;
        int i4 = this.d;
        if ((i4 == -1 || !aVar2.b.get(i4).a(f, f2)) && this.d != aVar2.b(f, f2)) {
            return true;
        }
        return false;
    }

    public final void c(Context context, XmlPullParser xmlPullParser) {
        int i2;
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains(RemoteSettings.i)) {
                    i2 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i2 = -1;
                }
                if (i2 == -1) {
                    if (attributeValue.length() > 1) {
                        i2 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.z0(context, xmlPullParser);
                this.f.put(i2, eVar);
                return;
            }
        }
    }

    public void d(YK yk) {
        this.g = yk;
    }

    public void e(int i2, float f, float f2) {
        e eVar;
        int i3;
        a aVar;
        int b2;
        e eVar2;
        int i4;
        int i5 = this.c;
        if (i5 == i2) {
            if (i2 == -1) {
                aVar = this.e.valueAt(0);
            } else {
                aVar = this.e.get(i5);
            }
            int i6 = this.d;
            if ((i6 == -1 || !aVar.b.get(i6).a(f, f2)) && this.d != (b2 = aVar.b(f, f2))) {
                if (b2 == -1) {
                    eVar2 = this.b;
                } else {
                    eVar2 = aVar.b.get(b2).g;
                }
                if (b2 == -1) {
                    i4 = aVar.c;
                } else {
                    i4 = aVar.b.get(b2).f;
                }
                if (eVar2 != null) {
                    this.d = b2;
                    YK yk = this.g;
                    if (yk != null) {
                        yk.b(-1, i4);
                    }
                    eVar2.r(this.a);
                    YK yk2 = this.g;
                    if (yk2 != null) {
                        yk2.a(-1, i4);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.c = i2;
        a aVar2 = this.e.get(i2);
        int b3 = aVar2.b(f, f2);
        if (b3 == -1) {
            eVar = aVar2.d;
        } else {
            eVar = aVar2.b.get(b3).g;
        }
        if (b3 == -1) {
            i3 = aVar2.c;
        } else {
            i3 = aVar2.b.get(b3).f;
        }
        if (eVar == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f + C6566gU0.h + f2);
            return;
        }
        this.d = b3;
        YK yk3 = this.g;
        if (yk3 != null) {
            yk3.b(i2, i3);
        }
        eVar.r(this.a);
        YK yk4 = this.g;
        if (yk4 != null) {
            yk4.a(i2, i3);
        }
    }
}
