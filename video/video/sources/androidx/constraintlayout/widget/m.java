package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import o.C5445bv2;
import o.C8590ol1;
import o.YK;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class m {
    public static final String f = "ConstraintLayoutStates";
    public static final boolean g = false;
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public SparseArray<a> d = new SparseArray<>();
    public YK e = null;

    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public ArrayList<b> b = new ArrayList<>();
        public int c;
        public boolean d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            this.d = false;
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
                        this.d = true;
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
        public boolean g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = Float.NaN;
            this.f = -1;
            this.g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.rf);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.c.sf) {
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f);
                    context.getResources().getResourceName(this.f);
                    if (C5445bv2.w.equals(resourceTypeName)) {
                        this.g = true;
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

    public m(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    public int a(int i, int i2, float f2, float f3) {
        a aVar = this.d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f2 != -1.0f && f3 != -1.0f) {
            Iterator<b> it = aVar.b.iterator();
            b bVar = null;
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(f2, f3)) {
                    if (i != next.f) {
                        bVar = next;
                    }
                }
            }
            if (bVar != null) {
                return bVar.f;
            }
            return aVar.c;
        } else if (aVar.c != i) {
            Iterator<b> it2 = aVar.b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f) {
                }
            }
            return aVar.c;
        }
        return i;
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), j.c.Ae);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == j.c.Be) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            continue;
                        } else if (C8590ol1.K.equals(xmlPullParser.getName())) {
                            return;
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    c = 0;
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
                            if (c == 3) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                        } else {
                            aVar = new a(context, xmlPullParser);
                            this.d.put(aVar.a, aVar);
                        }
                    }
                    eventType = xmlPullParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public boolean c(int i, float f2, float f3) {
        a aVar;
        int i2 = this.b;
        if (i2 != i) {
            return true;
        }
        if (i == -1) {
            aVar = this.d.valueAt(0);
        } else {
            aVar = this.d.get(i2);
        }
        a aVar2 = aVar;
        int i3 = this.c;
        if ((i3 == -1 || !aVar2.b.get(i3).a(f2, f3)) && this.c != aVar2.b(f2, f3)) {
            return true;
        }
        return false;
    }

    public void d(YK yk) {
        this.e = yk;
    }

    public int e(int i, int i2, int i3) {
        return f(-1, i, i2, i3);
    }

    public int f(int i, int i2, float f2, float f3) {
        a aVar;
        int b2;
        if (i == i2) {
            if (i2 == -1) {
                aVar = this.d.valueAt(0);
            } else {
                aVar = this.d.get(this.b);
            }
            if (aVar == null) {
                return -1;
            }
            if ((this.c != -1 && aVar.b.get(i).a(f2, f3)) || i == (b2 = aVar.b(f2, f3))) {
                return i;
            }
            if (b2 == -1) {
                return aVar.c;
            }
            return aVar.b.get(b2).f;
        }
        a aVar2 = this.d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int b3 = aVar2.b(f2, f3);
        if (b3 == -1) {
            return aVar2.c;
        }
        return aVar2.b.get(b3).f;
    }
}
