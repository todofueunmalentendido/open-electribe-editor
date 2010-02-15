/**
 * Copyright (c) 2010 SKRATCHDOT.COM
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Initial modeling finished using information provided by:
 * 	http://www.sonicspot.com/guide/wavefiles.html
 * 
 * Contributors:
 *     JEFF |:at:| SKRATCHDOT |:dot:| COM
 *
 * $Id$
 */
package com.skratchdot.riff.wav;

import java.io.File;
import java.io.IOException;

import com.skratchdot.riff.wav.util.WavRandomAccessFile;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIFF Wave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getChunks <em>Chunks</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getParseChunkExceptions <em>Parse Chunk Exceptions</em>}</li>
 *   <li>{@link com.skratchdot.riff.wav.RIFFWave#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave()
 * @model
 * @generated
 */
public interface RIFFWave extends EObject {
	/**
	 * Returns the value of the '<em><b>Chunks</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.Chunk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunks</em>' containment reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_Chunks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chunk> getChunks();

	/**
	 * Returns the value of the '<em><b>Parse Chunk Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link com.skratchdot.riff.wav.ParseChunkException}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parse Chunk Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parse Chunk Exceptions</em>' containment reference list.
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_ParseChunkExceptions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParseChunkException> getParseChunkExceptions();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see com.skratchdot.riff.wav.WavPackage#getRIFFWave_Size()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getSize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.IOException" fileDataType="com.skratchdot.riff.wav.File"
	 * @generated
	 */
	void write(File file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="com.skratchdot.riff.wav.IOException" outDataType="com.skratchdot.riff.wav.WavRandomAccessFile"
	 * @generated
	 */
	void write(RIFFWave riffWave, WavRandomAccessFile out) throws IOException;


} // RIFFWave