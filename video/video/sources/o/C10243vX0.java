package o;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o.vX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10243vX0 {
    public static final int b = -1;
    public static final String c = "CustomMethod";
    public static final String d = "CustomAttribute";
    public static HashMap<String, Constructor<? extends AbstractC6818hX0>> e = null;
    public static final String f = "KeyFrames";
    public HashMap<Integer, ArrayList<AbstractC6818hX0>> a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC6818hX0>> hashMap = new HashMap<>();
        e = hashMap;
        try {
            hashMap.put("KeyAttribute", C7788lX0.class.getConstructor(null));
            e.put("KeyPosition", EX0.class.getConstructor(null));
            e.put("KeyCycle", C8536oX0.class.getConstructor(null));
            e.put("KeyTimeCycle", HX0.class.getConstructor(null));
            e.put("KeyTrigger", IX0.class.getConstructor(null));
        } catch (NoSuchMethodException e2) {
            Log.e(f, "unable to load", e2);
        }
    }

    public C10243vX0() {
    }

    public static String f(int i, Context context) {
        return context.getResources().getResourceEntryName(i);
    }

    public void a(C4523Vk1 c4523Vk1) {
        ArrayList<AbstractC6818hX0> arrayList = this.a.get(-1);
        if (arrayList != null) {
            c4523Vk1.b(arrayList);
        }
    }

    public void b(C4523Vk1 c4523Vk1) {
        ArrayList<AbstractC6818hX0> arrayList = this.a.get(Integer.valueOf(c4523Vk1.c));
        if (arrayList != null) {
            c4523Vk1.b(arrayList);
        }
        ArrayList<AbstractC6818hX0> arrayList2 = this.a.get(-1);
        if (arrayList2 != null) {
            Iterator<AbstractC6818hX0> it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC6818hX0 next = it.next();
                if (next.g(((ConstraintLayout.b) c4523Vk1.b.getLayoutParams()).c0)) {
                    c4523Vk1.a(next);
                }
            }
        }
    }

    public void c(AbstractC6818hX0 abstractC6818hX0) {
        if (!this.a.containsKey(Integer.valueOf(abstractC6818hX0.b))) {
            this.a.put(Integer.valueOf(abstractC6818hX0.b), new ArrayList<>());
        }
        ArrayList<AbstractC6818hX0> arrayList = this.a.get(Integer.valueOf(abstractC6818hX0.b));
        if (arrayList != null) {
            arrayList.add(abstractC6818hX0);
        }
    }

    public ArrayList<AbstractC6818hX0> d(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    public Set<Integer> e() {
        return this.a.keySet();
    }

    public C10243vX0(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, androidx.constraintlayout.widget.a> hashMap;
        HashMap<String, androidx.constraintlayout.widget.a> hashMap2;
        char c2;
        AbstractC6818hX0 c7788lX0;
        try {
            int eventType = xmlPullParser.getEventType();
            AbstractC6818hX0 abstractC6818hX0 = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (e.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        if (c2 == 0) {
                            c7788lX0 = new C7788lX0();
                        } else if (c2 == 1) {
                            c7788lX0 = new EX0();
                        } else if (c2 == 2) {
                            c7788lX0 = new C8536oX0();
                        } else if (c2 == 3) {
                            c7788lX0 = new HX0();
                        } else if (c2 == 4) {
                            c7788lX0 = new IX0();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        c7788lX0.f(context, Xml.asAttributeSet(xmlPullParser));
                        c(c7788lX0);
                        abstractC6818hX0 = c7788lX0;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC6818hX0 != null && (hashMap2 = abstractC6818hX0.e) != null) {
                            androidx.constraintlayout.widget.a.q(context, xmlPullParser, hashMap2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC6818hX0 != null && (hashMap = abstractC6818hX0.e) != null) {
                        androidx.constraintlayout.widget.a.q(context, xmlPullParser, hashMap);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            Log.e(f, "Error parsing XML resource", e2);
        } catch (XmlPullParserException e3) {
            Log.e(f, "Error parsing XML resource", e3);
        }
    }
}
