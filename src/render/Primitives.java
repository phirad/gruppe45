package render;

import org.lwjgl.opengl.GL11;

/**
 * Diese Klasse stellt OpenGLObjekte die für das Spiel benötigt werden zur Verfügung.
 * -Würfel(Fest,Zerstörbar,...)
 * -Spielfiguren
 * -Bomben
 * -Items(Bonusgegenstände)
 */

public class Primitives {
	/**
	 * Zeichnet einen Würfel dessen Mittelpunkt die übergebene Position ist. Die
	 * aktuelle glColor wird verwendet.
	 * 
	 * @param gl
	 *            GL-Drawable
	 * @param x
	 *            horizontale Position
	 * @param y
	 *            vertikale Position
	 * @param z
	 *            Tiefenposition
	 * @param size
	 *            Kantenlänge des Würfels
	 */
	static public void DrawCube(float x, float y, float z, float size) {
		size /= 2;
		GL11.glBegin(GL11.GL_QUADS);
		// Vorne
		GL11.glVertex3f(x - size, y - size, z - size);
		GL11.glVertex3f(x - size, y + size, z - size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x + size, y - size, z - size);
		// Hinten
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x - size, y + size, z + size);
		// Rechts
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x + size, y - size, z - size);
		// Links
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x - size, y + size, z + size);
		GL11.glVertex3f(x - size, y + size, z - size);
		GL11.glVertex3f(x - size, y - size, z - size);
		// Oben
		GL11.glVertex3f(x - size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x - size, y + size, z - size);
		// Unten
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z - size);
		GL11.glVertex3f(x - size, y - size, z - size);
		GL11.glEnd();
		GL11.glColor3f(0, 0, 0);
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Vorne
		GL11.glVertex3f(x - size, y - size, z - size);
		GL11.glVertex3f(x - size, y + size, z - size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x + size, y - size, z - size);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Hinten
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x - size, y + size, z + size);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Rechts
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x + size, y - size, z - size);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Links
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x - size, y + size, z + size);
		GL11.glVertex3f(x - size, y + size, z - size);
		GL11.glVertex3f(x - size, y - size, z - size);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Oben
		GL11.glVertex3f(x - size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z + size);
		GL11.glVertex3f(x + size, y + size, z - size);
		GL11.glVertex3f(x - size, y + size, z - size);
		GL11.glEnd();
		GL11.glBegin(GL11.GL_LINE_LOOP);
		// Unten
		GL11.glVertex3f(x - size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z + size);
		GL11.glVertex3f(x + size, y - size, z - size);
		GL11.glVertex3f(x - size, y - size, z - size);
		GL11.glEnd();
	}

	/**
	 * Zeichnet einen Würfel dessen Mittelpunkt die übergebene Position ist. Die
	 * aktuelle glColor wird verwendet.
	 * 
	 * @param gl
	 *            GL-Drawable
	 * @param x
	 *            horizontale Position
	 * @param y
	 *            vertikale Position
	 * @param z
	 *            Tiefenposition
	 * @param sizeX
	 *            Breite
	 * @param sizeY
	 *            Höhe
	 * @param sizeZ
	 *            Tiefe
	 */
	static public void DrawCube(float x, float y, float z, float sizeX,
			float sizeY, float sizeZ) {
		sizeX /= 2;
		sizeY /= 2;
		sizeZ /= 2;
		GL11.glBegin(GL11.GL_QUADS);
		// Vorne
		GL11.glVertex3f(x - sizeX, y - sizeY, z - sizeZ);
		GL11.glVertex3f(x - sizeX, y + sizeY, z - sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z - sizeZ);
		GL11.glVertex3f(x + sizeX, y - sizeY, z - sizeZ);
		// Hinten
		GL11.glVertex3f(x - sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z + sizeZ);
		GL11.glVertex3f(x - sizeX, y + sizeY, z + sizeZ);
		// Rechts
		GL11.glVertex3f(x + sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z - sizeZ);
		GL11.glVertex3f(x + sizeX, y - sizeY, z - sizeZ);
		// Links
		GL11.glVertex3f(x - sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x - sizeX, y + sizeY, z + sizeZ);
		GL11.glVertex3f(x - sizeX, y + sizeY, z - sizeZ);
		GL11.glVertex3f(x - sizeX, y - sizeY, z - sizeZ);
		// Oben
		GL11.glVertex3f(x - sizeX, y + sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y + sizeY, z - sizeZ);
		GL11.glVertex3f(x - sizeX, y + sizeY, z - sizeZ);
		// Unten
		GL11.glVertex3f(x - sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y - sizeY, z + sizeZ);
		GL11.glVertex3f(x + sizeX, y - sizeY, z - sizeZ);
		GL11.glVertex3f(x - sizeX, y - sizeY, z - sizeZ);
		GL11.glEnd();
	}
}
